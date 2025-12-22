package com.kh.chap02.loop;

public class A_For {
	/*
	 * <반복문>
	 * - 실행할 코드를 반복적으로 수행시킬 수 있도록 도와주는 제어문
	 * - 크게 for문과 while문으로 나뉜다.
	 * 
	 * [표현법]
	 * for(초기식; 조건식; 증감식) {
	 *    반복적으로 수행할 코드
	 * }
	 * 
	 * - 초기식 : 반복문이 시작될 때 "초기에 단 한번만 실행"되는 구문
	 * 			(반복문에서 사용할 변수를 선언 및 초기화)
	 * 			ex) int i=0;
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 반복문이 수행.
	 * 			조건식이 false인 경우 반복문이 종료.
	 * 			(보통 초기식에서 제시된 변수를 사용하여 조건식을 작성)
	 * 			ex) i<10;
	 * 
	 * - 증감식 : 반복문을 제어하는 변수값을 "증감"시키는 구문
	 * 			(보통 초기식에서 제시된 변수를 증감)
	 * 			ex) i++, i--, i+=2 ...
	 * 
	 * for문 실행흐름
	 * 1. 초기식 실행
	 * 2. 조건식 실행
	 * 3-1. 조건식 결과가 참이라면 for문 내부 코드 실행
	 * 3-2. 조건식 결과가 거짓이라면 for문을 종료
	 * 4. for문 내부 코드 실행 후 증감식 실행.
	 * 5. 다시 조건식(2번)부터 쭉 반복 실행.
	 */
	
	public void method1() {
		// 5회 반복하는 반복문
		for(int i=0; i<5; i++) {
			System.out.println("안녕1");
		}
		
		for(int i=11; i<16; i++) {
			System.out.println("안녕2");
		}
		
		for(int i=0; i<10; i+=2) {
			System.out.println("안녕3");
		}
	}
	
	public void method2() {
		// 1 ~ 5 숫자를 출력하시오.
		for(int i=1; i<=5; i++) {
			System.out.print(i+" ");
		}
	}
	
	public void method3() {
		// 1과 10사이의 정수 증 "홀수"만 출력하는 반복문을 만드시오.
		// 출력결과 : 1 3 5 7 9
		// 초기식 : int i=1;
		for(int i=1; i<=10; i++) {
			if(i%2==1) System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=1; i<10; i+=2) {
			System.out.print(i+" ");
		}
	}
	
	public void method4() {
		// 1~10까지의 총 합계
		int sum=0;
		// sum+=1;
		// sum+=2;
		// sum+=3;
		// ...
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1부터 10까지의 총 합 : "+sum);
	}
	
	public void method5() {
		// 1에서부터 매번 달라지는 "랜덤값"까지의 총 합계
		/*
		 * java.lang.Math클래스의 random()을 호출하면,
		 * 매번 다른 "실수형"의 랜덤값을 얻어올 수 있다.
		 * 
		 * 랜덤값의 범위
		 * 0.0 <= 랜덤값 < 1.0
		 * 
		 * 만약 1과 10사이의 "정수형"의 랜덤값을 얻고 싶다면?
		 * 
		 * 1. 우선 10을 곱하기
		 *    0.0 <= 랜덤값 < 10.0
		 * 2. 1 더하기
		 *    1.0 <= 랜덤값 < 11.0
		 * 3. 소수점 버리기
		 *    1 <= 랜덤값 <= 10
		 *    
		 * 코드 => 랜덤값 * 10 + 1
		 * 10 => 출력하고자 하는 갯수
		 * 1 => 시작숫자
		 * Math.random() * 출력할 갯수 + 시작수
		 */
		int random = (int)(Math.random()*10+1);
		System.out.println("랜덤값 : "+random);
		
		int sum=0;
		for(int i=1; i<=random; i++) {
			sum+=i;
		}
		System.out.println("sum : "+sum);
	}
	
	public void method6() {
		//문자열의 문자를 반복
		String str="abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method7() {
		// 중첩 반복문
		// 구구단 출력
		// 2 X 1 = 2
		// 2 X 2 = 4
		// ...
		// 2 X 9 = 18
		
		for(int i=1; i<=9; i++) {
			System.out.println("2*"+i+"="+(2*i));
		}
	}
	
	public void method() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4-1-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<2*i+1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
