package com.kh.chap01_constant.model.vo;

public class Car {
	private String name;
	private int carColor;
	
	// Car클래스의 차색(carColor)을 관리하는 상수값
	public static final int BLACK = 0;
	public static final int RED = 1;
	public static final int BLUE = 2;
	
	/*
	 * 상수의 단점
	 *  - 변수명을 통해 의미부여가 가능하지만, 값 자체에는 의미가 없다.
	 *  - 따라서 상수가 많아질수록 관리가 힘들어진다.
	 */
	public static final int GREEN = 3;
	public static final int YELLOW = 3;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCarColor() {
		return carColor;
	}
	public void setCarColor(int carColor) {
		this.carColor = carColor;
	}

	public void setColor(Color c) {
		this.carColor = c.getColor();
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", carColor=" + carColor + "]";
	}
}
