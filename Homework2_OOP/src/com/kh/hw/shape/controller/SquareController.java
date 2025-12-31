package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		
		double result = width*2 + height*2;
		
		return result;
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(3, height, width);
		return width * height;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
		System.out.println("색이 수정되었습니다.");
	}
	
	public String print() {
		s.setType(4);
		return s.information();
	}
}
