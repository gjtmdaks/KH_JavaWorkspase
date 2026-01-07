package com.kh.chap02_string.controller;

public class B_StringBuilderAndBuffer {
	/*
	 * StringBuilder and StringBuffer
	 *  - 문자열 기반 가변클래스
	 *  - 문자열의 메모리 부족 이슈를 해결하기 위해 만들어진 클래스
	 *  - 두 클래스의 사용방법은 동일함
	 *  - 차이점은 "동기화"여부
	 *  - StringBuilder는 동기화를 지원하지 않기 때문에 "멀티스레드환경"에서 좋은 성능을 보인다.
	 *  - StringBuffer는 동기화를 지원하기 때문에 "멀티스레드환경"에서 스레드 안전성을 보장할 수
	 *    있으나 성능이 좋지 못하다.
	 */
	
	public void method() {
		String str = "Hello";
		str += "World";
		
		StringBuilder sb1 = new StringBuilder("hello");
		sb1.append("World"); // 같은 저장공간에서 이어쓰기 가능
		sb1.append("!!!"); // 주소값 1개만 사용.
		
		StringBuffer sb2 = new StringBuffer("hello");
		sb2.append("World!");
		
		System.out.println(sb1);
		System.out.println(sb2.toString());
		
		System.out.println("문자열의 길이는 ? " + sb1.length());
		System.out.println("문자열에서 o의 마지막 위치는 ? " + sb1.lastIndexOf("o"));
		// 0번 인덱스부터 문자를 삭제.
		System.out.println("모든 글자 삭제 : " + sb1.delete(5, sb1.length()));
		// 특정 위치의 문자를 삭제
		System.out.println("마지막 위치의 문자 삭제하기 : " + sb1.deleteCharAt(sb1.length()-1));
	}
}
