package com.kh.chap06.method.model.vo;

public class OverloadTest {
	/*
	 * 메서드 오버로딩 - 한 클래스 내에 "같은 이름의 메서드를 여러개" 정의할 수 있는 방법. - 단, 매개변수의 자료형, 개수 순서를 다르게
	 * 작성해줘야 한다. - 그 외, 매개변수의 이름이나, 접근제한자, 반환형은 다르더라도 메서드 오버로딩에 영향을 주지 않는다.
	 */
	public void test() {

	}

	public void test(int a) {

	}

	// 매개변수 이름은 서로 다르더라도, 자료형이 같기 때문에 똑같은 메서드로 취급한다.
//	public void test(int b) {
//		
//	}

	// 매개변수의 개수는 위와 동일하지만, 자료형이 다르므로 다른 메서드로 취급한다.
	public void test(String a) {

	}

	public void test(int a, String b) {

	}

	// 자료형의 순서가 다르기 때문에 메서드 오버로딩이 적용
	public void test(String b, int a) {

	}

	// 접근제한자는 오버로딩에 영향을 주지 않는다.
//	private void test(String b, int a) {
//
//	}

	// 반환형은 메서드 오버로딩돠 상관없다.
//	public int test(String b, int a) {
//		return 1;
//	}
}
