package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println("키 "+height+"cm인 "+age+"살 "+
		gender+"자 "+name+"님 반갑습니다 ^^");
	}
	
	public void practice2() {
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		System.out.println("더하기 : " + (num1 + num2));
		System.out.println("빼기 : " + (num1 - num2));
		System.out.println("곱하기 : " + num1 * num2);
		System.out.println("나누기 : " + num1 / num2);
	}
	
	public void practice3() {
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();

		System.out.print("세로 : ");
		double height = sc.nextDouble();

		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + (width + height)*2);
	}
	
	public void practice4() {
		
		System.out.print("문자열을 입력 : ");
		String str = sc.next();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}
	
	public void practice5() {
		
		System.out.print("국 : ");
		double kor = sc.nextDouble();

		System.out.print("영 : ");
		double eng = sc.nextDouble();

		System.out.print("수 : ");
		double math = sc.nextDouble();
		
		int total = (int)(kor + eng + math);
		int avg = total / 3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
	
	public void practice6() {
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum= 2.5;
		char ch = 'A';
			
		System.out.println( iNum1/iNum2 ); // 2
		System.out.println( (int)dNum ); // 2
			
		System.out.println( (double)iNum2*dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
			
		System.out.println( (double)iNum1/iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
			
		System.out.println( (int)fNum ); // 3
		System.out.println( (int)(iNum1/fNum) ); // 3
			
		System.out.println( iNum1/fNum );// 3.3333333
		System.out.println( (double)iNum1/fNum ); // 3.3333333333333335
			
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch+iNum1 ); // 75
		System.out.println( (char)(ch+iNum1) ); // 'K'
	}
	
}