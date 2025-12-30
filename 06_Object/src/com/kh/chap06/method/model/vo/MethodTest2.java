package com.kh.chap06.method.model.vo;

public class MethodTest2 {
	/*
	 * static 메서드
	 * [표현법]
	 * 접근제한자 static 예약어 반환형 메서드명(매개변수) {
	 *    코드
	 *    return;
	 * }
	 *  - 메서드 호출시 객체를 생성할 필요가 없다.
	 *  - 프로그램 시작시 정적메모리 영역에 메서드정보가 저장되어있기 때문.
	 *  - 클래스명.메서드명(전달값);으로 호출하면 된다.
	 *    (Math.random();)
	 */
	static int count = 1;
	int count2 = 2;
	
	public static int method(int num1) {
		/*
		 * static메서드 안에서는 일반 field는 접근이 불가능하다
		 *  - 변수의 생성시점이 다르기 때문
		 *  - static메서드는 프로그램 시작과 동시에 정적메모리영역에 할당되는데,
		 *    같은 시점에 static변수 함께 할당되기때문에 static변수는 사용 가능.
		 *  - 하지만, 일반 전역변수는 객체 생성시점에 메모리에 공간이 할당되므로,
		 *    static메서드에서 사용이 불가능하다.
		 */
		
		// 매개변수 * static변수 (문제없음)
		return num1 * count;
		//return num1 * count2;
	}
}
