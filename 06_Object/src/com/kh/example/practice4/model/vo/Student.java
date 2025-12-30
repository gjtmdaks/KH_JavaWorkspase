package com.kh.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	static{
		grade = 3;
	}
	{
		classroom = 2;
		name = "허승만";
		height = 172.1;
		gender = '남';
	}
	
	public Student() {}
	
	public void information() {
		System.out.println("학년 : "+grade);
		System.out.println("반 : "+classroom);
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height);
		System.out.println("성별 : "+gender);
		
		System.out.println(grade+"학년 "+classroom+"반 "+
		name+" 학생은 키가 "+height+"cm인 "+gender+"자 입니다.");
	}
}
