package com.kh.chap02_abstract.part01.run;

import com.kh.chap02_abstract.part01.model.vo.*;

public class Run {
	public static void main(String[] args) {
		// 추상클래스로 객체생성?
		//  - 추상클래스는 객체 생성이 불가능.
		//  - 참조변수로는 사용이 가능
		// Sports s = new Sports();
//		Sports s = new Sports() {
//			
//			@Override
//			public void rule() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		Sports s = new Basketball();
		
		Sports[] arr = new Sports[2];
		arr[0] = s;
		arr[1] = new Football();
		
		for(Sports spo : arr) {
			spo.rule();
		}
		
		/*
		 * 추상클래스
		 *  - 추상클래스란 미완성된 부분이 존재하는 클래스임을 의미(abstract class)
		 *  - 미완성된 클래스이기 때문에 객체 생성은 불가능하나, 참조변수로는 사용이 가능하다.
		 *  - 추상메서드가 포함된 경우, 클래스는 반드시 추상클래스로 정의해야 한다.
		 *  - 추상클래스는 "일반 필드", "일반 메서드", "생성자", "추상메서드"로 이루어져 있다.
		 *  - 추상클래스는 클래스의 상속이 주된 목적이며, 메서드 강제구현은 곁다리.
		 *  
		 * 추상메서드
		 *  - 미완성된 메서드를 의미하며, 메서드의 몸통부가 구현되어있지 않은 메서드
		 *  - 추상메서드는 자식클래스에서 "오버라이딩"을 통하여 완성되며, 자식클래스에서
		 *    상속받은 추상메서드를 재정의하지 않는 경우 에러가 발생한다.
		 *  - 추상메서드를 통해 클래스간의 통일성을 확보할 수 있다.
		 */
	}
}
