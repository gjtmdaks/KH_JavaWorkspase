package com.kh.example.practice3.model.vo;

public class Circle {
	private final static double PI = 3.14;
	private  static int radius = 1;
	
	public Circle() {}
	
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() {
		// 둘레 = 2*PI*r
		double area = 2*PI*radius;
		System.out.println("둘레 : "+area);
	}
	
	public void getSizeOfCircle() {
		// 넓이 = PI*r^2
		double size = PI*(radius*radius);
		System.out.println("넓이 : "+size);
	}
}
