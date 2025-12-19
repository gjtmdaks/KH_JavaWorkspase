package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증감연산자(단항연산자) ++ -- ++ : 변수에 담긴 값을 1 증가 ++변수(전위연산자) 변수++(후위연산자)
	 * 
	 * -- : 변수에 담긴 값을 1감소
	 * 
	 * (증감연산자)변수 : 전위연산 -> 선증감 후처리 변수(증감연산자) : 후위연산 -> 선처리 후증감
	 * 
	 */

	public void method1() {
		int num = 10;
		System.out.println("전위연산 적용 전 num : " + num); // 10
		System.out.println("1회 수행 : " + ++num); // 11
		System.out.println("2회 수행 : " + ++num); // 12
		System.out.println("3회 수행 : " + ++num); // 13
		System.out.println("최종 num : " + num); // 13

		int num2 = 10;
		System.out.println("후위연산 적용 전 num2 : " + num2); // 10
		System.out.println("1회 수행 : " + num2++); // 10(11)
		System.out.println("2회 수행 : " + num2++); // 11(12)
		System.out.println("3회 수행 : " + num2++); // 12(13)
		System.out.println("최종 num2 : " + num2); // 13
	}

	public void method2() {
		// 전위연산
		int a = 10;
		int b = ++a; // 증감하고(11) 집어넣기(11)
		System.out.println("a : " + a); // 11 이미 증감한 상태
		System.out.println("b : " + b); // 11

		// 후위연산
		int c = 10;
		int d = c++; // 집어넣고(10) 증감하기(11)
		System.out.println("c : " + c); // 11 이미 증감한 상태
		System.out.println("d : " + d); // 10

		int num = 20;
		System.out.println("현재 num : " + num); // 20

		System.out.println("++num? : " + ++num); // 21
		System.out.println("num++? : " + num++); // 21(22)
		System.out.println("--num? : " + --num); // 21
		System.out.println("num--? : " + num--); // 21(20)

		System.out.println("최종 num? : " + num); // 20
	}

	public void method3() {
		int num1 = 20;
		int result1 = num1++ * 3;

		System.out.println(num1); // 21
		System.out.println(result1); // 60
	}

	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		// 주석으로 어떻게 출력될거같은지 생각하기
		System.out.println(a++); // 10(11)
		System.out.println((++a) + (b++)); // 12+20=32(b=21)
		System.out.println((a++) + (--b) + (--c)); // 12(13) + 20 + 29 = 61
		System.out.printf("a: %d , b: %d, c: %d", a, b, c); // a: 13, b : 20, c : 29
	}

}
