package com.kh.chap02_string.controller;

public class A_StringPool {
	// Pool = 저장공간
	// StringPool = 문자열 저장공간
	/*
	 * String는 불변클래스(변하지 않는 클래스)
	 * String은 기존에 담겨있던 값이 수정되는 순간 원래 담겨있던 공간에서 수정되지 않고,
	 * 새로운 저장공간을 할당한 후, 거기에 값을 추가한다.
	 */
	
	// 문자열 상수 풀(String constant pool)
	// - 문자열 데이터가 담기는 영역으로, Heap메모리영역상에 항상 고정적으로 할당되어있다.
	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2); // false(주소값 비교)
		System.out.println(str1); // toString()메서드가 오버라이딩 되어있음.
		System.out.println(str2);
		
		System.out.println(str1.equals(str2)); // true(문자열 비교)
		
		System.out.println(str1.hashCode()); // 주소값 반환 메서드
		System.out.println(str2.hashCode());
		// 기존 hashCode()는 16진수 메모리 주소값을 10진수로 변환하는 메서드
		// String의 hashCode()메서드의 경우 주소값이 아닌 "담긴 문자열을 10진수로"
		// 변환해주는 메서드로 오버라이딩 되어있다.
		
		// 실제 참조변수의 주소값을 확인하는 메서드
		// System.identityHashCode(변수);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	// 2. 문자열 리터럴로 변수 초기화
	public void method2() {
		String str1 = new String("hello");
		String str2 = "hello"; // 문자열 상수풀(SCP)에 저장됨
		String str3 = "hello"; // str2와 같은 주소값을 공유
		String str4 = "world";
		
		/*
		 * 자바에서는 문자열 리터럴 사용시 상수풀에 값을 저장한다.
		 * 
		 * 문자열 상수풀 동작방식
		 * 1. 프로그램 실행 도중 문자열 리터럴을 만나면, 우선 문자열 리터럴값이 이미
		 *    상수풀에 보관되어 있나 검사를 진행(intern)
		 * 2. 만약 상수풀에 저장된 리터럴값이 아니라면, 문자열의 hashCode함수를 호출하고
		 *    그 값을 상수풀의 주소값으로 활용하여 값을 저장한다.
		 * 3. 만약 이미 상수풀에 그 값이 저장되어 있다면, 저장되어있는 주소값을 반환한다.(얕은복사)
		 */
		
		/*
		 * hashCode메서드를 오버라이딩한 이유
		 *  - 문자열은 문자열 기반 hashCode값을 상수풀상의 주소값으로 사용하고 있다.
		 *    따라서 상수풀안에 데이터를 저장할 때 문자열을 해시코드값으로 변환한 후 그 자리에
		 *    데이터가 있는지 없는지 검사를 실행하고, 이미 값이 있다면 해당 주소값을 변수에 할당
		 *    하거나 데이터가 없었다면 상수풀에 새롭게 값을 등록하고 그 주소값을 반환한다.
		 */
		System.out.println(str1 == str2); // false
		System.out.println(str2 == str3); // true
		
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
	
	/*
	 * 자바에서 가장 많이 사용되는 자료형은 String
	 * String이 메모리영역에서 차지하는 비중이 크기 때문에 메모리 부족 이슈가 종종 발생.
	 * 이 메모리 부족이슈를 해결하기 위해 나온 기능이 '문자열 상수 풀'
	 * 
	 * 단, 문자열상수풀로도 감당이 불가능할 정도릐 문자열 연산이 자주 사용되는 프로그램이라면
	 * 문자열보다는 문자열기반 가변클래스인 (StringBuffer, StringVuilder)를
	 * 사용하는 것을 권장.
	 */
	public void method3() {
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		
		str += "abc";
		System.out.println(System.identityHashCode(str));
	}
}
