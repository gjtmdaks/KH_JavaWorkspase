package com.kh.chap01_innerClass.part04_anoymous;

public class OuterClass4 {
	/*
	 * 익명 내부 클래스
	 *  - 이름이 없는 내부 클래스
	 *  - 지역 내부클래스에서 불필요해 보이는 코드를 없애고 간결화 시킨 방법
	 *  - class선언 및 객체 생성을 하나로 합쳐서 표현한다.
	 */
	public Runnable runner = new Runnable() {
		private int num = 10;

		@Override
		public void run() {
			System.out.println(num);
		}
	};
	
	public Runnable getRunnable() {
		return new Runnable() {
			private int num = 10;

			@Override
			public void run() {
				System.out.println(num);
			}
		};
	}
	
	
}
