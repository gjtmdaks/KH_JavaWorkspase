package com.kh.chap01_innerClass.part02_static.model.vo;

public class Member {
	private String id;
	private String name;
	private int age;
	
	public Member() {
		
	}
	
	/*
	 * 기존 객체생성 및 초기화 방식
	 * 1) 생성자를 이용한 객체생성 및 초기화
	 *  - 객체를 생성할때 매개변수를 전달하여 필드값을 초기화 하는 방식
	 *  - 단점으로는, 필드가 많을수록 만들어야하는 생성자가 많아질 수 있다.
	 *  - 생성자 매개변수의 정보를 설명할 수 없기 때문에 잘못된 값이 추가될 위험이 있다.
	 * 
	 * 2) setter방식을 이용한 객체 초기화
	 *  - 추가해야할 값의 정보를 확인할 수 있기 때문에 가독성은 좋으나, 코드길이가 길어질 수 있다.
	 *  - 객체의 불변성이 깨질 수 있다.
	 * 
	 * 빌더패턴
	 *  - 자바의 "객체생성방식의 단점"을 보완하기 위해 고안된 객체생성 디자인 패턴
	 *  - 정적 내부클래스로 외부클래스의 필드를 초기화 하고, 외부클래스 객체를 최종적으로
	 *    생성하여 반환하는 방식.
	 *  - 매개변수 생성자가 많아지는 경우 사용을 고려하는 것이 좋다.
	 */
	
	// 호출시 외부클래스.Builder
	public static class Builder {
		private String id;
		private String name;
		private int age;
		
		public Builder() {
			
		}
		
		public Builder id(String id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		// 빌드메서드
		// 빌더클래스의 초기화된 데이터를 검증 후, 외부클래스 객체의 필드로 옮겨서 반환하는 메서드
		public Member build() {
			Member m = new Member();
			// 필수 정보 검증
			if(id == null) {
				return null;
			}
			// 옮겨담기
			m.id = id;
			m.name = name;
			m.age = age;
			
			return m;
		}
	}
	
	@Override
	public String toString() {
		return "Builder [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
