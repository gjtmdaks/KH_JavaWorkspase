package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ArrayForeach {
	public static void main(String[] args) {
		int [] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// basic loop
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 향상된/개선된 반복문 advanced loop / foreach
		/*
		 * for each문
		 *  - 배열 또는 컬렉션과 함께 사용되는 반복문으로, 배열 또는 컬렉션의
		 *    0번 인덱스부터, 마지막 인덱스까지 순차적으로 접근할 때 사용.
		 *    
		 * 초기식 조건식 증감식 x
		 * 반복횟수는 배열의 크기.
		 * 
		 * [표현법]
		 * for( 순차적으로 접근한 값을 담을 변수 : 배열명 ) {
		 *    // 반복적으로 실행할 내용
		 * }
		 */
		int[] arr2 = {10,20,30};
		for(int a : arr2) {
			System.out.println(a);
		}
		
		Phone[] phones = new Phone[3]; // [null,null,null]
		
		phones[0] = new Phone("갤럭시","삼성","노트25",1500000);
		phones[1] = new Phone("아이폰","애플","11프로",1300000);
		phones[2] = new Phone("아이폰","애플","10프로",900000);
		
		// phones객체 배열에 저장된 핸드폰 가격들의 총 합 구하기.
		int sum = 0;
		for(Phone p : phones) {
			sum += p.getPrice();
		}
		System.out.println("총 가격의 합계 : "+sum);
	}
}
