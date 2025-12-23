package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 * break : 코드 실행 중 break문을 만나게 되면 현재 속해있는 가장 가까운
	 * 			반복문을 빠져나간다.
	 */
	public void method1() {
		// 매번 반복적으로 랜덤값(1~100)를 출력.
		// 단, 출력된 랜덤값이 3의 배수인 경우 반복을 종료.
		while(true) {
			int random = (int)(Math.random()*100+1);
			System.out.println("랜덤값 : "+random);
			
			if(random%3==0) {
				break;
			}
		}
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void method2() {
		while(true) {
			System.out.print("문자열 입력(종료=exit) : ");
			String str = sc.next();
			
			if(str.equals("exit")) {
				System.out.println("종료");
				break;
			}
			
			System.out.println(str+"의 글자수 : "+str.length());
		}
	}
	
	public void method3() {
		// 매번 반복적으로 사용자에게 양수를 입력받아 1부터 사용자가 입력한 값까지
		// 출력하는 프로그램을 작성하시오.
		// 단, 사용자가 양수를 입력하는 경우 반복을 종료 시키시오.
		while(true) { // 매번 반복적으로(무한 반복)
			System.out.print("양수를 입력하시오 : ");
			double num = sc.nextDouble();
			
			if(num>0 && num%1==0) {
				for(int i=1; i<=num; i++) { //1~입력값까지 반복출력
					System.out.println(i);
				}
				break;
			}
			System.out.println("잘못 입력했습니다.");
		}
	}
	
	public void method4() {
		// 심볼
		
		loop1:
		for(int i=0; i<10; i++) {
			loop2:
			for(int j=0;j<10; j++) {
				System.out.println(i);
				if(i==5) break loop1; // loop1(외부 반복문) 종료
				// break: 가장 가까운 반복문 탈출.
			}
		}
	}
}
