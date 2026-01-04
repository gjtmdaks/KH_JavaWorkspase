package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];	// 객체배열 생성 {{이름,과목,점수},{김길동,자바,100},...}
	public static int CUT_LINE = 60;			// 커트라인
	
	public StudentController() {				// 기본 생성자
		sArr[0] = new Student("김길동","자바",100);	// 객체배열을 샘플 데이터 값으로 초기화
		sArr[1] = new Student("박길동","디비",50);
		sArr[2] = new Student("이길동","화면",85);
		sArr[3] = new Student("정길동","서버",60);
		sArr[4] = new Student("홍길동","자바",20);
	}
	
	public Student[] printStudent() {			// 객체배열 값을 반환
		return sArr;
	}
	
	public int sumScore() {			// 실행 결과 = 학생 점수 합계 : 315에서
		int sum = 0;				// 315(점수의 합(score))를 전달 
		for(Student a : sArr) {		// 객체배열 Student[] sArr을 객체변수 a(변수이름 변경가능)에 대입(a<-("김길동","자바",100) 입력) 후
			sum += a.getScore();	// a에서 점수값만 뽑아서 계산
		}
		return sum;					// sum = 100 + 50 + 85 + 60 + 20
	}
	
	public double[] avgScore() {
		double[] result = new double[2];	// 배열 생성 후
		result[0] = sumScore();				// 첫번째로 sumScore를 넣고
		result[1] = result[0]/sArr.length;	// 두번째로 평슌(sumScore/5)를 입력		sumScore = result[0], 5 = sArr배열의 총 크기
		
		return result;
	}
}
