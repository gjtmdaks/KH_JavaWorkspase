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
		s.setHeight(height);
		s.setWidth(width);
		
		double result = width * height;
		
		return result;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		String result = "사각형\n"+s.information();
		return result;
	}
}
