package com.kh.chap02_protocol.tcp.server.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientRun {
	public static void main(String[] args) {
		// 1) 연결하고자 하는 서버의 ip주소와 port번호 저장
		int serverPort = 30000;
//		String serverIp = "192.168.10.31"; // 강사님
		String serverIp = "192.168.10.39"; // 내 pc
		Socket socket = null;
		
		try {
			// 2) 서버의 ip주소와  port번호를 활용하여 서버에 연결요청
			socket = new Socket(serverIp, serverPort);
			
			System.out.println("서버 연결 성공!");
			
			// 3) 서버와 연결된 입출력 스트림 생성
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				Scanner sc = new Scanner(System.in);){
				
				while(true) {
					System.out.print("서버에 보낼 메세지 : ");
					String message = sc.nextLine();
					
					pw.println(message);
					pw.flush();
					
					if(message.equals("exit")) {
						System.out.println("접속종료");
						break;
					}
					
					System.out.println("받은 메세지 : "+br.readLine());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
