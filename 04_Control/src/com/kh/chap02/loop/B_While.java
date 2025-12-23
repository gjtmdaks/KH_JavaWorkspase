package com.kh.chap02.loop;

public class B_While {
	/*
	 * while문
	 * [표현법]
	 * 
	 * [초기식] // 필수 아님
	 * while(조건식){
	 *    // 반복적으로 수행할 코드
	 *    [증감식] // 필수 아님
	 * }
	 */
	
	public void method1() {
		// for문을 while문으로 변경
		for(int i=0; i<5; i++) {
			System.out.println("안녕1");
		}
		// System.out.println(i);
		// i가 for문 안에서 선언되었기에 for문을 나오면 사용할 수 없음
		
		int i=0; // 초기식
		while(i<5) { // 조건식
			System.out.println("안녕");
			i++; // 증감식
		}
		System.out.println(i);
		// 하지만 while문은 바깥에서 선언해서 while문을 나와도 사용할 수 있음
	}
	
	public void method2() {
		// while문으로 5회 반복하여 아래 코드 출력
		// 1 2 3 4 5
		int i=1;
		while(i<=5) {
			System.out.print(i++ +" ");
			//i++;
		}
	}
	
	/*
	 * 횟수를 기준으로 반복할 경우 for문
	 * 반복횟수가 불규칙한 경우, 사용자가 중간에 개입해서 중단해야 할 경우 while문
	 * 보통 while문 단독으로는 안쓰고 분기문과 함께 사용
	 */
	
	public void method3() {
		// 1부터 랜덤값(1~10)까지의 총 합계를 while문으로 작성
		// 출력에서 : 1부터 xxx까지의 합계는 xxx 입니다.
		int random=(int)(Math.random()*10+1);
		int i=1;
		int sum=0;
		while(i<=random) {
			sum+=i++;
		}
		System.out.println("1부터 "+random+"까지의 합계는 "+sum+"입니다.");
	}
	
	/*
	 * do~while
	 * [표현법]
	 * do {
	 *    // 반복 실행할 코드(단, 최초 1회는 반드시 수행)
	 * } while(조건식);
	 *  - do~while문은 별도의 조건검사 없이 최초 1회는 무조건 실행된다.
	 *  - do 일단 실행하고 while 조건에 맞으면 더 해라
	 */
	
	public void method4() {
		int i=1;
		do {
			System.out.println("하이!");
			i++;
		}while(false);
		System.out.println(i);
	}
	
	public void method5() {
		// do~while문을 활용하여
		// 1 2 3 4 5 출력
		int i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=5);
	}
}
