package com.kh.chap01.before.run;

import com.kh.chap01.after.model.vo.Tv;
import com.kh.chap01.before.model.vo.Desktop;
import com.kh.chap01.before.model.vo.SmartPhone;

public class BeforeRun {
	public static void main(String[] args) {
		// 데스크탑 객체
		Desktop d = new Desktop("삼성","d-01","데탑",2000000,true);
		// 스마트폰 객체
		SmartPhone sp = new SmartPhone("애플","s-01","아이폰11",1500000,"KT");
		// 티비 객체
		Tv t = new Tv("엘지", "t-01", "얇은 TV", 3500000, 60);

		
		System.out.println(d.information());
		System.out.println(sp.information());
		System.out.println(t.information());
		
		/*
		 * 매 클래스마다 중복된 코드들을 일일히 기술해두게 되면
		 * 수정과 유지보수에서 번거로움이 발생함.
		 * 
		 * 상속이라는 개념을 적용시켜,
		 * 매 클래스에 존재하는 중복된 필드 및 메서드를 하나의 클래스에 정의해두고, 이 클래스를
		 * 상속시켜주는 방식으로 작업한다.
		 */
	}
}
