package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	// BufferedWriter/Reader
	
	public void fileSave() {
		BufferedWriter bw = null;
		
		try {
			// 보조스트림이 Writer계열이라면, 기반스트림도 Writer로 생성해주어야 한다.
			bw = new BufferedWriter(new FileWriter( new File("c_buffer.txt")));
			
			bw.write("안녕하세요?");
			bw.newLine(); // 개행문자 넣어주는 메서드
			bw.write("반갑습니다.\n");
			
			bw.flush(); // 버퍼공간(8kb)을 비워주는 메서드. close() 호출시 자동 호출.
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		/*
		 * try ~ with ~ resource구문(jdk7이상)
		 * 
		 * try(스트림객체생성; ...) {
		 *    // 코드
		 * } catch(예외클래스) {
		 *    e.printStackTrace();
		 * }
		 * 
		 * 스트림객체를 try에 붙여넣으면 스트림객체 생성 후 해당 블록의 구문이 실행 완료되면 알아서 자원을
		 * 반납(close)한다.
		 */
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			String value = null;
			while((value = br.readLine()) != null) {

				System.out.println(value); // 한줄씩 값을 문자열로 반환
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
