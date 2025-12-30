package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		// 기본생성자로 객체 생성
		User u1 = new User();
		
		// 매개변수있는 생성자로 객체 생성
		User u2 = new User("user01");
		System.out.println(u2.getUserId());
		
		// 매개변수있는 생성자2로 객체 생성
		User u3 = new User("user03", 30, 'M');
		System.out.println(u3.getUserId());
		System.out.println(u3.getAge());
		System.out.println(u3.getGender());
		
	}
}
