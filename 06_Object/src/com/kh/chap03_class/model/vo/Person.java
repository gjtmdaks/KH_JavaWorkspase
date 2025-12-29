package com.kh.chap03_class.model.vo;

public class Person {
	/*
	 * 클래스 실습예제
	 * - -> pricate
	 * + -> public
	 * # -> protected
	 * ~ -> default
	 */
	
	// 필드부
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 메서드부
	public void changeName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(name);
	}
}
