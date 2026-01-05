package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	private double PI = Math.PI;
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		
		double area = PI * radius * radius;
		return c+", 면적="+area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		
		double circum = PI * radius * 2;
		return c+", 둘레="+circum;
	}
}
