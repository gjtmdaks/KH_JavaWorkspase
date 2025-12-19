package com.kh.operator;

public class C_Compound {
	
	/*
	 * 복학대입연산자
	 *  - 산술연산자와 대입연산자를 함께 사용하는 연산자
	 *  - 연산속도가 빨라지므로 사용을 권장
	 */
	public void method() {
		int num = 12;
		
		num = num + 3;
		num += 3; // 복합대입연산자
		
		// num값을 5 감소
		num -= 5;
		
		// num값을 7배 증가
		num *= 7;
		
		// num값을 2배 감소
		num /= 2;
		
		// num을 4로 나누었을 때 나머지 값을 num에 대입
		num %= 4;
		
		// +=의 경우 문자열 접합이 가능
		String str = "Hello";
		str += "World";
	}
}
