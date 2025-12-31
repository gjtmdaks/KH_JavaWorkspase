package com.kh.chap05.constructor.model.vo;

public class User {
	// 필드부
	private String userId;
	private int age;
	private char gender;
	
	// 생성자부
	/*
	 * 생성자
	 *  - 객체를 생성하는 기능을 담당
	 * [표현법]
	 * public 클래스명([매개변수]) {
	 *    // 생성자를 통해 개체 생성 시 실행할 코드
	 * }
	 * 언제나 클래스 자기자신을 반환하기에
	 * void라는 반환자 자체가 없음
	 * 
	 * User u = new User();
	 * 여기에서 new User()가 생성자를 가리키며 클래스의 주소를 가진다.
	 * 따라서 u.메서드(); 뿐만 아니라 new User().메서드();로도 사용 가능
	 * 
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위함
	 * 2. 객체생성과 동시에 매개변수로 전달된 값을 통해 필드를 초기화할 목적으로도 사용.
	 * 
	 * 생성자 작성 시 주의사항
	 * 1. 클래스명과 동일해야한다(대/소문자 포함)
	 * 2. 반환형이 존재하지 않는다.
	 * 3. 여러개 생성이 가능하지만, 매개변수가 중복되면 안된다(메서드 오버로딩과 동일한 개념)
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면, 기본생성자를 JVM이 만들어주지 않는다.
	 * 
	 * JVM = Java Virtual Machine = 자바 프로그램을 실행하는 가상 컴퓨터
	 * OS의 종류(ios, android, windows, linux, unix 등)에 종속받지 않고
	 * CPU가 자체적으로 JAVA를 인식, 실행할 수 있음
	 */
	
	// 기본 생성자
	//  - 생성자 미 작성시 JVM이 자동으로 만들어주는 생성자
	//  - 되도록 항상 기본생성자를 추가하는 습관을 가질 것.
	public User() {
		System.out.println("기본생성자 호출");
	}
	
	// 매개변수있는 생성자
	//  - 전달받은 매개변수를 통해 필드를 초기화할 목적으로 사용하는 생성자
	public User(String userId) {
		this.userId = userId;
	}
	
	// 매개변수있는 생성자2
	public User(String userId, int age, char gender) {
		// 다른 생성자에서 동일한 필드값을 초기화 하고 있는 경우,
		// 현재 생성자에서 다른 생성자를 호출하는 방식으로 코드를 줄일 수 있다.
		this(userId); // this생성자 호출(반드시 첫줄에 기술)
		//this.userId = userId;
		
		this.age = age;
		this.gender = gender;
	}
	
	//메서드부
	// set/get메서드 생성
	// 1. userId get/set
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return this.gender;
	}

}
