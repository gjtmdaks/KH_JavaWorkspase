package com.kh.practice.func;

import java.util.ArrayList;
import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("인원 수 : ");
		int human = sc.nextInt();

		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();

		int result1 = candy / human;
		int result2 = candy % human;

		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);
	}

	public void practice2() {
		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();

		System.out.print("반(숫자만) : ");
		int classes = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();

		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		String g = gender == 'M' || gender == 'm' ? "남학생" : (gender == 'F' || gender == 'f' ? "여학생" : "오류");

		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		float score = sc.nextFloat();

		System.out.println(grade + "학년 " + classes + "반 " + num + "번 " + name + " " + g + "의 성적은 " + score + "이다.");
	}

	public void practice3() {
		System.out.print("나이 : ");
		int age = sc.nextInt();

		String result = age <= 13 ? "어린이" : (age <= 19 ? "청소년" : "성인");

		System.out.println(result);
	}

	public void practice4() {
		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		double avg = total / 3.0;

		String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println(result);
	}

	public void practice5() {
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num = sc.next().charAt(7);

		String gender = num == '1' || num == '3' ? "남자" : (num == '2' || num == '4' ? "여자" : "오류");

		System.out.println(gender);
	}

	public void practice6() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int input = sc.nextInt();

		boolean result = input <= num1 || num2 < input;
		System.out.println(result);
	}

	public void practice7() {
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		boolean result = num1 == num2 && num2 == num3;
		System.out.println(result);
	}

	public void practice8() {
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();

		System.out.print("B사원의 연봉 : ");
		int num2 = sc.nextInt();

		System.out.print("C사원의 연봉 : ");
		int num3 = sc.nextInt();

		double fin1 = num1 * 1.4; // num1 + num1*0.4
		double fin2 = num2 * 1.0;
		double fin3 = num3 * 1.15;

		String a = fin1 >= 3000 ? "3000 이상" : "3000 미만";
		String b = fin2 >= 3000 ? "3000 이상" : "3000 미만";
		String c = fin3 >= 3000 ? "3000 이상" : "3000 미만";

		System.out.println("A사원 연봉/연봉+a : " + num1 + "/" + fin1);
		System.out.println(a);
		System.out.println("B사원 연봉/연봉+a : " + num2 + "/" + fin2);
		System.out.println(b);
		System.out.println("C사원 연봉/연봉+a : " + num3 + "/" + fin3);
		System.out.println(c);
	}

	// chat GPT 도움
	// 배열리스트를 만들어서 연봉과 인센티브를 저장
	// 반복문으로 사원의 인덱스 (A,B,C 등)를 증가 + 최종금액 계산 + 결과 출력
	public void practice9() {
		ArrayList<Integer> salaries = new ArrayList<>();
		ArrayList<Double> incentives = new ArrayList<>();

		int i = 0;

		// 1️. 연봉 입력
		while (true) {
			char employee = (char) ('A' + i);
			System.out.print(employee + "사원의 연봉 (종료하려면 end 입력) : ");

			String input = sc.nextLine();

			if (input.equalsIgnoreCase("end")) {
				break;
			}

			salaries.add(Integer.parseInt(input));
			i++;
		}

		// 2️. 인센티브 입력
		for (int j = 0; j < salaries.size(); j++) {
			char employee = (char) ('A' + j);
			System.out.print(employee + "사원의 인센티브 : ");
			incentives.add(Double.parseDouble(sc.nextLine()));
		}

		// 3️. 결과 출력
		System.out.println("========== 결과 ==========");

		for (int j = 0; j < salaries.size(); j++) {
			double finalSalary = salaries.get(j) * (incentives.get(j) + 1);
			String result = finalSalary >= 3000 ? "3000 이상" : "3000 미만";

			System.out.println((char) ('A' + j) + "사원 연봉/연봉+a : " + salaries.get(j) + "/" + finalSalary);
			System.out.println(result);
		}
	}

}
