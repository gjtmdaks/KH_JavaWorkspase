package com.kh.chap04.field.model.vo;

public class FieldTest3 {
	/*
	 * static : 정적인, 고정된
	 * static키워드는 특정 변수나 메서드를 static메모리 영역에 "고정"시켜 둔다.
	 * 따라서 자주 사용하는 변수, 메서드를 static으로 관리하여 메모리 영역에 고정시켜두고
	 * 사용하면 효율이 좋으며, 가끔 사용되는 변수나 메서드를 static영역에 보관하면 효율이
	 * 좋지 않다.
	 */
	public static String sta = "static 변수";
	
	// final : 상수를 정의하는 키워드
	// 한번 저장된 값을 고정해서 사용하기 위해 대부분의 static변수는 final예약어를
	// 함께 사용.
	public static final double PI = 3.14;
	
	public static void test() {
		System.out.println("하이");
	}
}
