package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int width, int height) {
		r = new Rectangle(x, y, width, height);
		
		int area = width * height;
		return r + ", 면적="+area;
	}
	
	public String calcPerimeter(int x, int y, int width, int height) {
		r = new Rectangle(x, y, width, height);
		
		int perimeter = 2 * (width + height);
		return r + ", 둘레="+perimeter;
	}
}
