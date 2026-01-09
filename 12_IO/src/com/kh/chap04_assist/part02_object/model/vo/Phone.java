package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

/*
 * 직렬화가 되지 않은 일반 클래스는 입/출력이 불가능
 * 
 * 직렬화(Serialization)
 *  - 객체의 상태를 그대로 저장하거나, 복원하는 방식을 직렬화/역직렬화라고 부른다.
 *  - 객체 데이터를 byte로 변환하여 입/출력 매체에 저장하는 과정을 직렬화
 *  - 저장된 byte를 다시 객체상태로 복원하는 과정을 역직렬화라고 부른다.
 *  - 자바에서는 직렬화를 위해서 Serializable 인터페이스를 구현해야한다.
 */

public class Phone implements Serializable {
	private String name;
	private int price;
	// transient : 객체 입출력시 해당값을 입출력하지 않게 하는 예약어
	private transient String password;
	
	public Phone() {
		
	}
	
	public Phone(String name, int price, String password) {
		super();
		this.name = name;
		this.price = price;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + ", password=" + password + "]";
	}
}
