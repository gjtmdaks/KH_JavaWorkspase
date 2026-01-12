package com.kh.chap02_set.model.vo;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	/*
	 * 서로다른 객체의 필드값이 동일하다면 같은 객체가 될 수 있게 하기위해선?
	 * 1. equals메서드 오버라이딩
	 * 2. hashCode메서드 오버라이딩
	 */
	
	@Override
	public boolean equals(Object o) {
		// 매개변수로 전달받은 객체가 Student객체가 아닌경우.
		if(!(o instanceof Student)) {
			return false;
		}
		
		boolean result = false;
		
		Student s = (Student) o;
		// 이름, 나이, 점수가 모두 같다면..
		if(this.name.equals(s.name) 
				&& this.age == s.age 
				&& this.score == s.score) {
			result = true;
		}
		
		return result;
	}

	/*
	 * hashCode()
	 *  - Object의 hashCode는 저장된 주소값을 10진수의 형태로 반환해주는 메서드
	 *  - hashCode는 HashMap, HashSet에서 데이터를 저장하기위한 key값에 사용되는 메서드
	 *  - hashCode를 오버라이딩하지 않고 equals메서드만 오버라이딩하게 되면 논리적으로 두 객체는 같음을
	 *    판달할 수 있지만, 데이터가 저장될때는 서로 다른 주소값을 가지므로 중복으로 데이터가 저장되어 버린다.
	 *  - 즉, hashCode는 객체의 주소값으로 활용된다.
	 */
	@Override
	public int hashCode() {
		return (name + age + score).hashCode();
	}
}
