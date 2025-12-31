package com.kh.chap01.after.run;

import com.kh.chap01.after.model.vo.*; // * = 모든

public class AfterRun {
	public static void main(String[] args) {
		// 객체3
		Desktop d = new Desktop("삼성", "d-01", "삼성데탑", 2000000, true);
		SmartPhone sp = new SmartPhone("애플", "s-01", "아이폰11", 1300000, "KT");
		Tv t = new Tv("엘지", "t-01", "얇은 TV", 3500000, 60);

		System.out.println(d.information());
		System.out.println(sp.information());
		System.out.println(t.information());
		
		/*
		 * 실행하고자 하는 메서드가 자식클래스에 없다면, 자동으로 부모클래스의 메서드를 실행한다.
		 * 단, 자식클래스에 부모클래스에 존재하는 메서드를 재정의(오버라이딩)했다면,
		 * "자식클래스가 실행 우선권"을 가진다.
		 * 
		 * 상속 장점
		 * 1. 유지보수가 편해진다.(생산성 증가)
		 * 2. 작은양의 코드로 다양한 클래스들을 작성할 수 있다.
		 * 3. 정의해둔 부모클래스를 통해 다른 클래스로의 확장이 용이하다.(확장성이 좋다)
		 * 
		 * 상속의 특징
		 *  - 클래스간의 상속은 다중 상속이 불가능하다(단일 상속만 지원)
		 *  - 명시되어있지 않지만 모든 클래스는 "Object클래스의 후손"이다.
		 *    => Object의 메서드를 사용할 수 있다.
		 *    => Object의 메서드가 마음에 안들면 오버라이딩이 가능하다.
		 */
	}
}
