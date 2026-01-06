package com.kh.chap02_abstract.part02.run;

import com.kh.chap02_abstract.part02.model.vo.*;

public class Run {
	public static void main(String[] args) {
		// 추상클래스
		// - 객체생성 불가. 단, 참조변수로는 사용 가능
		// Person p = new Person();
		Person p1 = new Mother("민경민", 50, 70, "출산");
		Person p2 = new Baby("응애", 3.5, 70);
		
		System.out.println(p1); // 동적바인딩
		System.out.println(p2);
		
		p1.eat(); // 동적바인딩
		p2.eat();
		p1.sleep();
		p2.sleep();
		
		System.out.println("\n다음날");
		System.out.println(p1);
		System.out.println(p2);
		
		// 인터페이스
		// - 객체생성 불가. 단, 참조변수로는 사용 가능
		// Basic b = new Basic();
		Basic b1 = new Mother("민경민", 50, 70, "출산");
		Basic b2 = new Baby("응애", 3.5, 70);
		
		b1.eat(); // 동적바인딩
		b2.eat();
		
		System.out.println(b1); // 동적바인딩
		System.out.println(b2);
	}
}
