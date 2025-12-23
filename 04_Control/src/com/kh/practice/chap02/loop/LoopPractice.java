package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			for(int i=1; i<=num; i++) {
				System.out.print(i+" ");
			}
			break;
		}
		
		/*
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.print(i+" ");
		}
		
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice1();
		}
		*/
	}
	
	public void practice2() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			for(int i=0; i<num; i++) {
				System.out.print(num-i+" ");
			}
			break;
		}
		
		/*
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=num; i>0; i--) {
			System.out.print(i+" ");
		}
		
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice2();
		}
		*/
	}
	
	public void practice3() {
		while(true) {
			System.out.print("정수를 하나 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			int sum = 0;
			for(int i=1; i<=num; i++) {
				sum+=i;
				System.out.print(i+" ");
				if(i!=num) System.out.print("+ ");
			}
			System.out.print("= "+sum);
			break;
		}
		/*
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum+=i;
			System.out.print(i+ (i!=num ? " + " : " = "));
		}
		System.out.println(sum);
		*/
	}
	
	public void practice4() {
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1<1 || num2<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			
			if(num1>num2) {
				for(int i=num2; i<=num1; i++) {
					System.out.print(i+" ");
				}
			}else {
				for(int i=num1; i<=num2; i++) {
					System.out.print(i+" ");
				}
			}
			break;
		}
		
		/*
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
			
		if(!(num1>0 && num2>0)) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();
			return;
			// main -> practice4 -> 숫자 오류 -> practice4 재호출
			// 정상 숫자 -> 정상 숫자 print -> 오류 숫자 print
			// 재호출 작업 끝나면 호출됐던 그자리로 되돌아감.
		}
		
		int min = num1>num2 ? num2 : num1;
		int max = num1>num2 ? num1 : num2;
		
		for(int i=min; i<=max; i++) {
				System.out.print(i+" ");
			}
		*/
	}
	
	public void practice5() {
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num<1 || num>9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			}
			
			for(int i=0; num+i<=9; i++) {
				System.out.println(num+i+"단");
				for(int j=1; j<=9; j++) {
					System.out.println(num+i+"*"+j+"="+(num+i)*j);
				}
			}
			break;
		}
		/*
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(!(num>1 && num<9)) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			practice5();
			return;
		}
		
		for(int dan=num; dan<=9; dan++) {
			System.out.println("===="+dan+"단 ====");
			for(int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}
		*/
	}
	
	public void practice6() {
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int pattern = sc.nextInt();
		
		// 10회 반복하라
		for(int i=0; i<10; i++) {
			System.out.print(num+" ");
			num+=pattern;
		}
	}
	
	public void practice7() {
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String ch = sc.next();

			if(ch.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			if(ch.equals("/") && num2==0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			
			double result = 0;
			switch(ch) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = (double)num1 / num2;
				break;
			case "%":
				result = num1 % num2;
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println(num1+" "+ch+" "+num2+" = "+result);
		}
	}
	
	public void practice8() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num; j-i>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		String result = "";
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				result = "소수가 아닙니다.";
				break;
			}else{
				result = "소수입니다.";
			}
		}
		System.out.println(result);
	}
	
	public void practice11() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		int total=0;
		String result="";
		for(int i=2; i<=num; i++) {
			result = "소수입니다.";
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					result = "소수가 아닙니다.";
					break;
				}
			}
			if(result.equals("소수입니다.")) {
				System.out.print(i+" ");
				total++;
			}
		}
		System.out.println();
		System.out.println("2부터 "+num+"까지 소수의 개수는 "+total+"개입니다.");
	}
	
	public void practice12() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count=0;
		for(int i=1; i<=num; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			}
			if(i%2==0 && i%3==0) {
				count++;
			}
		}
		System.out.println();
		System.out.println("count : "+count);
	}
}
