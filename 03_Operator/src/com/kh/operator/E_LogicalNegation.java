package com.kh.operator;

public class E_LogicalNegation {
	/*
	 * 논리부정연산자 !(단항연산자)
	 * 
	 * !논리값
	 *  -논리값을 반대로 바꿔주는 연산자
	 * 
	 */
	public void method1() {
		System.out.println("true의 부정 " + !true);
		
		boolean b = true;
		boolean b2 = !b;
		
		boolean b3 = !(5 > 3);
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);
	}
}
