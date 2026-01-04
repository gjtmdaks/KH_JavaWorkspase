package com.kh.practice.student.model.vo;

public class Student {
	private String name;	// 이름
	private String subject;	// 과목
	private int score;		// 점수
	
	public Student() {		// 기본 생성자
		
	}
	
	public Student(String name, String subject, int score) {	// 변수있는 생성자
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	// set/getter 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	// 학생정보 전달
	public String inform() {
		return "이름 : "+name+" / 과목 : "+subject+" / 점수 : "+score;
	}
}
