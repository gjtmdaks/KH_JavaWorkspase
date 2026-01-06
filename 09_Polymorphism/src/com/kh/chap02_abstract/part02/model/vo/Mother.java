package com.kh.chap02_abstract.part02.model.vo;

// 인터페이스 상속 (implements)
//  - 클래스와 클래스의 상속 관계(단일상속) : 클래스명 extends 부모클래스
//  - 클래스와 인터페이스의 상속 관계(다중상속) : 클래스명 implements 인터페이스 1, 인터페이스 2, 3...
//  - 인터페이스와 인터페이스의 상속 관계(다중상속) : 인터페이스명 extends 인터페이스 1, 인터페이스 2, 3...

public class Mother extends Person implements Basic {
	private String babyBirth; // 아기의 탄생여부 : 출산, 입양, 없음
	
	public Mother() {
		
	}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "Mother [babyBirth=" + babyBirth + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void eat() {
		// 엄마가 밥을 먹으면
		// 몸무게 10 증가, 건강도 10 감소.
		setWeight(getWeight() + 10);
		setHealth(getHealth() - 10);
	}

	@Override
	public void sleep() {
		// 엄마가 잠을 자면
		// 건강도 10 증가.
		setHealth(getHealth() + 10);
	}
}
