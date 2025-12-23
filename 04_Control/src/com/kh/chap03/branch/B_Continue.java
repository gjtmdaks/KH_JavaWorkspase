package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue :
	 *  - 프로그램 실행 중 continue문을 만나게 되면, 그 뒤에 있는 코드들은
	 *    실행하지 않고, 가장 가까운 반복문으로 돌아가서 재실행 한다.
	 */
	
	public void method1() {
		// 홀수만 출력하기
		for(int i=1; i<=10; i++) {
			if(i%2==0) { // 짝수면
				continue; // 스킵
			}
			System.out.print(i+" ");
		}
	}
	
	public void method2() {
		// 1부터 100까지의 총 합계를 구하기
		// 단, 6의 배수는 제외하고 더하기
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%6==0) {
				continue;
			}
			System.out.println(sum+"+"+i+"="+(sum+i));
			sum+=i;
		}
		System.out.println(sum);
	}
}
