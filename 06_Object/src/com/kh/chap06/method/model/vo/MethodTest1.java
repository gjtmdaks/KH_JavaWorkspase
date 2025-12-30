package com.kh.chap06.method.model.vo;

public class MethodTest1 {
	/*
	 * 메서드
	 * [표현법]
	 * 접근제한자 예약어 자료형 메서드명([매개변수]) {
	 *    // 수행할 코드
	 *    
	 *    return 반환할 값; (생략가능)
	 * }
	 * 반환할 값 X => void
	 * 반환할 값 a=0 => int
	 * 반환할 값 a="Hello" => String
	 */
	
	// 1. 매개변수가 없고, 반환할 값도 없는 메서드
	public void method1() {
		System.out.println("매개변수 x, 반환값 x");
		
		// return; 자료형이 void(반환값이 없을 경우)면 생략가능
	}
	
	// 2. 매개변수 x, 반환형 o
	public int method2() {
		System.out.println("매개변수 x, 반환값 o");
		int random = (int)(Math.random()*100+1);
		
		return random;
	}
	
	// 3. 매개변수 o, 반환형 x
	public void method3(int x, int y) {
		System.out.println("매개변수 o, 반환값 x");
		int min = 0;
		int max = 0;
		
		if(x > y) {
			min = y;
			max = x;
		}else {
			min = x;
			max = y;
		}
		
		System.out.println("최소값 : "+min+", 최대값 : "+max);
	}
	
	// 4. 매개변수 o, 반환형 o
	public int method4(int a, int b) {
		System.out.println("매개변수 o, 반환값 o");
		return a * b;
	}
}
