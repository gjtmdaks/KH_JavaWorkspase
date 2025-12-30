package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		
		double result = width * height / 2;
		
		return result;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		String result = "삼각형\n"+s.information();
		return result;
	}
}
