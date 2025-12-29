package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {
	/*
	 * 캡슐화
	 *  - 추상화를 통해 정의된 속성과 기능들을 묶어서 관리하는 기법으로, "데이터의 접근제한"을
	 *    원칙으로 둔다.
	 *  - 외부로부터 "데이터의 접근"을 막는 역할을 수행.
	 *  - 객체 내부의 데이터를 반드시 확인하거나 사용해야하는 경우, 객체 내부의 값을 조작할 수 있는
	 *    메서드를 추가로 작성해줘야 한다.
	 */
	public static void main(String[] args) {
		Student std = new Student();
		// std.height; 캡슐화를 통해 데이터가 은닉
		std.setName("허승만"); // setter메서드를 활용한 초기화.
		
		System.out.println(std.getName());
	}
}
