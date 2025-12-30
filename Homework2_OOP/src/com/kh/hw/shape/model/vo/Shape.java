package com.kh.hw.shape.model.vo;

public class Shape {
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	public Shape() {
		
	}
	
	public Shape(int type, double height, double width) {
		
	}
	
	public String information() {
		String result = "높이 : "+height+
					"\n너비 : "+width+
					"\n색깔 : "+color;
		return result;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	public int getType() {
		return type;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidtht() {
		return width;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
