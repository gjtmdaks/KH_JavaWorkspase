package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("입력");
			break;
		case 2:
			System.out.print("수정");
			break;
		case 3:
			System.out.print("조회");
			break;
		case 4:
			System.out.print("삭제");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			return;
			// 매서드 내 어디서든 사용가능
			// 현재 위치에서 메서드를 "종료"시키는 키워드
			// break;
		default:
			System.out.print("없는");
		}
		System.out.println(" 메뉴입니다.");
	}
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		/*
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		*/
		
		if(!(num > 0)) {
			System.out.println("양수만 입력해주세요.");
			return;
		}
		if(num % 2 == 0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
	}
	
	public void practice3() {
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		float avg = sum/3.0f;
		
		/*
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		*/
		
		if(!(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60)) {
			System.out.println("불합격입니다.");
			return;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("축하합니다, 합격입니다!");
	}
	
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String season = "";
		switch(month) {
		case 1: case 2: case 12:
			season = "겨울";
			break;
		case 3, 4, 5:
			season = "봄";
			break;
		case 6, 7, 8:
			season = "여름";
			break;
		case 9, 10, 11:
			season = "가을";
			break;
		default:
			//season = "잘못 입력된 달";
			System.out.println(month+"월은 잘못 입력된 달입니다.");
			return;
		}
		
		System.out.println(month+"월은 "+season+"입니다.");
	}
	
	public void practice5() {
		String realId = "minmin";
		String realPw = "Min1234";
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		/*
		if(id.equals("realId")) {
			if(pw.equals("realPw")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		*/
		
		if(!(id.equals(realId))) {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}
		if(!(pw.equals(realPw))) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}
		System.out.println("로그인 성공");
	}
	
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.next();
		
		switch(grade) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("해당 권한은 존재하지 않습니다.");
		}
	}
	
	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		String result = "";
		
		if(bmi < 18.5) {
			result = "저체중";
		}else if(bmi < 23) {
			result = "정상체중";
		}else if(bmi < 25) {
			result = "과체중";
		}else if(bmi < 30) {
			result = "비만";
		}else {
			result = "고도 비만";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
	}
	
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		if (!(num1 > 0 && num2 > 0)) {
	        System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
	        return;
	    }
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.next().charAt(0);
		float result;
		
		switch(ch) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = (float)num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		System.out.println(num1+""+ch+""+num2+"="+result);
	}
	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int num1 = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int num2 = sc.nextInt();
		System.out.print("과제 점수 : ");
		int num3 = sc.nextInt();
		System.out.print("출석 회수 : ");
		int num4 = sc.nextInt();
		
		float midle = num1*0.2f;
		float fin = num2*0.3f;
		float home = num3*0.3f;
		float num = num4/1.0f;
		float total = midle + fin + home + num;
		
		System.out.println("================= 결과 =================");
		
		if(num4 < 14) {
			System.out.println("Fail [출석 회수 부족 (" + num4 + "/20)]");
			return;
		}
		
		System.out.println("중간 고사 점수(20) : " + midle);
		System.out.println("기말 고사 점수(30) : " + fin);
		System.out.println("과제 점수		(30) : " + home);
		System.out.println("출석 점수		(20) : " + num);
		System.out.println("총점 : " + total);
		
		if(total >= 70) {
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
	}
	
	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("없는 메뉴입니다.");
		}
	}
	
	public void practice11() {
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pw = sc.nextInt();
		
		if(pw < 1000 || pw > 9999) {
			System.out.println("자리수 안맞음");
			return;
		}
		
		int a = pw / 1000;
		int b = pw / 100 % 10;
		int c = pw / 10 % 10;
		int d = pw % 10;
		
		if(a == b || a == c || a == d ||
			b ==c || b == d || c == d) {
			System.out.println("중복 값 있음");
			return;
		}
		
		System.out.println("생성 성공");
	}
}
