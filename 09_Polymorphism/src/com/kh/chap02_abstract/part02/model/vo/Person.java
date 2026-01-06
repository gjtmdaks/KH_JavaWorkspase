package com.kh.chap02_abstract.part02.model.vo;

public abstract class Person {
	// 일반 필드
	private String name;
	private double weight;
	private int health;
	
	public Person() {
		
	}

	public Person(String name, double weight, int health) {
		super();
		this.name = name;
		this.weight = weight;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", health=" + health + "]";
	}
	
	// 일반 메서드, 생성자, 필드, 추상메서드
	public abstract void eat();
	public abstract void sleep();
}
