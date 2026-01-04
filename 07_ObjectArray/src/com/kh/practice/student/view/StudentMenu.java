package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {	// 학생정보와 성적, 결과 출력하는 기본생성자
		System.out.println("========== 학생 정보 출력 ==========");
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		
		// StudentController = ssm
		// StudentController의 printStudent() = ssm.printStudent()
		// printStudent()의 반환 값 = sArr 객체배열
		
		Student[] sArr = ssm.printStudent(); // 학생객체배열 sArr
		for(Student s : sArr) {		// 객체배열 Student[] sArr을 객체변수 s(변수이름 변경가능)에 대입(s<-("김길동","자바",100) 입력) 후
			System.out.println(s.inform());	// s만 넣으면 s객체가 입력되어있는 장소의 주소값이 출력됨.
		}
		
		System.out.println("========== 학생 성적 출력 ==========");
		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
		
		// StudentController의 avgScore() = ssm.avgScore();
		// avgScore()은 더블객체
		
		double[] dArr = ssm.avgScore();
		System.out.println("학생 점수 합계 : "+(int)dArr[0]);
		System.out.println("학생 점수 평균 : "+dArr[1]);

		System.out.println("========== 학생 결과 출력 ==========");
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		
		// CUT_LINE이 저장되어있는 장소 = controller = ssm
		// int a = ssm.CUT_LINE;도 가능
		
		for(Student s : sArr) {	// 학생별로 검사해야 하기에 객체배열 sArr을 순서대로 순회
			String pf = s.getScore()<StudentController.CUT_LINE ? "재시험 대상자" : "통과";	// 삼항연산자로 각 학생의 점수 판별
			System.out.println(s.getName()+" 학생은 "+pf+"입니다");
		}
	}
}
