package com.kh.operator;

import java.util.Scanner;

public class D_Logical {
	/*
	 * 논리 연산자
	 *  - 논리 값 두개를 비교하는 연산차
	 * 
	 * AND && : a && b -> a와 b가 모두 참일 경우 true.
	 * 					  a와 b 둘 중 하나라도 거짓일 경우 false.
	 * 
	 * OR  || : a || b -> a와 b 둘 중 하나라도 참일 경우 true.
	 * 					  a와 b가 모두 거짓일 경우 false.
	 * 
	 * ~하면서 => AND
	 * 또는 => OR
	 * 
	 */
	
	Scanner sc = new Scanner(System.in);
	public void method1() {
		System.out.print("숫자를 하나 입력하세요.");
		int num = sc.nextInt();
		
		// num의 값이 0보다 크면서 짝수입니까?
		boolean result = num > 0 && num % 2 == 0;
		
		System.out.println(result);
	}
	
	public void method2() {
		// 입력한 값이 1 이상 100 이하의 숫자인지 확인.
		// 1 <= x <= 100
		System.out.print("정수 : ");
		int num = sc.nextInt();

		// 1 <= x <= 100을 자바식으로 변환
		// (1 <= x) && (x <= 100)
		boolean result = (1 <= num) && (num <= 100);
		
		System.out.println(result);
	}
	
	public void method3() {
		// 사용자가 입력한 값이 'y'거나 'Y'인 경우 참, 아니면 거짓을 반환하시오.
		System.out.print("계속 진행하시려면 y/Y를 입력해주세요 : ");
		char ch = sc.next().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		
		System.out.println(result);
	}
	
	public void method4() {
		int num1 = 10;
		
		// and연산자의 경우 A && B의 조건 중 A의 값이 false인 경우
		// 뒤 쪽 조건들이 뭐든 무조건 false이기 때문에 뒤쪽 조건식은 실행하지
		// 않는다.
		boolean result1 = (num1 < 5) && (num1++ > 0);
		System.out.println("result1 : " + result1);
		System.out.println(num1); // 10
		
		int num2 = 10;
		boolean result2 = num2 < 20 || ++num2 > 0;
		System.out.println("result2 : " + result2);
		System.out.println(num2); // 10
	}
}
