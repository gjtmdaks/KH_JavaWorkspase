package com.kh.chap02_enum.run;

import com.kh.chap02_enum.model._enum.CarColor;

public class Run {
	public static void main(String[] args) {
		System.out.println(CarColor.BLACK);
		System.out.println(CarColor.BLACK.getName());
		System.out.println(CarColor.BLACK.getColor());
		System.out.println(CarColor.valueOf("BLACK"));
		CarColor.valueOf("WHITE").printTest();
		
		System.out.println(CarColor.valueOf(0));
		System.out.println(CarColor.valueOf(2));
		//System.out.println(CarColor.valueOf(20));
		CarColor.RED.printTest();
	}
}
