package com.kh.exception.controller;

public class C_CustomException extends Exception {
	/*
	 * 특정상황에서 발생하는 예외를 직접 만드는 방법
	 * 1. 예외처리클래스 생성 후, Exception클래스를 상속
	 * 2. super키워드를 통해 부모생성자에 매개변수로 메세지를 전달
	 * 3. 부모생성자에서 msg내용 호출하면서 예외처리
	 */
	
	public C_CustomException(String msg) {
		super(msg);
	}
}
