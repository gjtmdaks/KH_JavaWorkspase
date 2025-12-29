package com.kh.chap04.field.model.vo;

public class FieldTest1 {
	/*
	 * 필드 == 인스턴스 변수 == 멤버 변수
	 * 
	 * 변수 구분
	 * - 전역변수 : 클래스영역 바로 아래에 선언하는 변수를 의미.
	 * 			 클래스 내부라면 어디서든 사용가능
	 * - 지역변수 : 클래스 영역 내에서 특정영역({})에 선언한 변수를 의미.
	 * 			 선언한 영역에서만 사용이 가능(if, 메서드, for...)
	 * 
	 * 1. 전역변수
	 *  - 필드 == 인스턴스 변수 == 멤버변수
	 *    생성시점 : 객체가 메모리에 할당되면서 생성.(heap)(클래스 = new 클래스();)
	 *    소멸시점 : 객체가 소멸할 때 함께 소멸.
	 * 
	 *  - 클래스변수 == static 변수
	 *    생성시점 : 프로그램 시작과 동시에 static영역에 메모리 할당(static)
	 *    소멸시점 : 프로그램 종료 시.
	 *    
	 * 2. 지역변수
	 *    생성시점 : 특정영역({})이 실행될 때 저장공간이 할당(stack)
	 *    소멸시점 : 특정영역이 끝날 때.
	 */
	// public static int age; <- 클래스변수
	private int global; // 전역변수 (필드)
	
	public void test(int num) { // 매개변수(지역변수)
		int local = 0; // 지역변수
		
		if(true) {
			int a = 0;
		}

		// 초기화하지 않으면 에러 발생.
		System.out.println(local);
		
		// 전역변수의 저장위치는 heap 메모리영역이며, 이 공간은 비어있을 수 없기때문에
		// jvm 자료형의 기본값으로 초기화 시켜두었다.
		System.out.println(global);
		
		// 메서드 호출을 위해선 "반드시" 매개변수를 전달해야 하므로 값의 초기화는 보장된 것.
		System.out.println(num);
		
		// a 변수는 if문 내에서 선언되었기에 if문을 벗어나면 사용할 수 없음.
		//System.out.println(a);
		
		FieldTest2 ft2 = new FieldTest2();
		System.out.println(ft2.pub);
		System.out.println(ft2.pro);
		System.out.println(ft2.df);
		// System.out.println(ft2.pri);
	}
}
