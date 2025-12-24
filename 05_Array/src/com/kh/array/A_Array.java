package com.kh.array;

import java.util.Arrays;

public class A_Array {
	/*
	 * 변수 : 하나의 공간에 하나의 값을 저장할 수 있는 저장공간.
	 * 		int a = 10;
	 * 		a = 20; => 위의 a=10 내용은 삭제
	 * 
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있다.("같은 자료형" 기순)
	 * 		ex) int[] arr = new int[3];
	 * 		int자료형 값을 담을 수 있는 저장공간이 3칸 할당된다.(4byte * 3)
	 * 		[0, 0, 0 ]
	 * 		배열에서 저장된 데이터를 꺼낼 때는 "인덱스"를 활용하며, 인덱스값은 0부터 시작.
	 * 		arr[0], arr[1], arr[2]
	 * 		배열의 크기가 만약 5라면, 배열의 마지막 인덱스는 4
	 * 		배열의 크기가 n이라면, 해당 배열의 마지막 인덱스는 항상 n-1
	 */
	
	public void method1() {
		/*
		 * 배열 선언
		 * 자료형 [] 배열명;
		 * 자료형 배열명 [];
		 */
		int a;
		int [] arr;
		int arr2 [];
		
		/*
		 * 배열 할당
		 * - 이 배열이 몇 개의 값들을 보관할건지 그 배열의 크기를 지정해주는 과정
		 * - 크기를 지정해주면, 지정한 갯수만큼의 저장공간을 가진 배열이 생성
		 * 
		 * [표현법]
		 * 배일명 = new 자료형[배열크기];
		 */
		
		arr = new int[5]; // 할당 완료. [0, 0, 0, 0, 0]
		int [] arr3 = new int[5]; // 보통은 선언과 할당을 같이 함.
		// System.out.println(a); // int a는 초기화가 안되어있음
		System.out.println(arr3[0]); // 배열은 크기할당과 동시에 기본값이 주어짐
		/*
		 * 배열은 메모리의 Heap 구역에 저장
		 * Heap은 공유메모리로 다른 사람도 쓰기에 빈공간(낭비)이 있으면 안됨.
		 * 따라서 배열에 크기를 할당하면 자동으로 해당 자료형의 기본값을 저장
		 * int => 0, boolean => false 등
		 */
		
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3; // [1, 2, 3, 0, 0]
		
		System.out.println(arr3[3]); // 0
		System.out.println(arr3[2]); // 3
		System.out.println(arr3); // 참조형변수
		/*
		 * 배열의 저장공간인 Heap 메모리는 주소값 기반으로 작동함
		 * 따라서 arr3처럼 배열 내부의 값이 아닌 배열 자체를 출력하면
		 * 해당 배열의 주소값이 16진수로 출력됨.
		 */
	}
	
	public void method2() {
		int num = 10;
		/*
		 * 매소드 내부에서 기본자료형 변수 선언 시 Stack에 생성
		 * int, byte, long 등
		 */
		int [] iArr = new int[5]; // [0,0,0,0,0]
		/*
		 * 배열 생성 후 크기 할당하면 기본값으로 강제 초기화 되고
		 * Stack에 배열의 주소값이 저장되어 주소값을 통해 Heap의 배열데이터로 접근
		 */
		System.out.println("iArr : "+iArr); // 배열에 저장한 값이 아닌 접근을 위한 주소값
		System.out.println("iArr의 HashCode : "+iArr.hashCode());
		// 주소값을 10진수 형태로 변경해주는 함수
		
		int [] iArr2 = new int[5]; //[0,0,0,0,0]  // iArr과 상관없는 새로운 주소
		System.out.println("iArr2의 HashCode : "+iArr2.hashCode());
		
		int [] iArr3 = iArr2; // 얕은 복사	 // iArr2와 같은 주소값
		System.out.println("iArr3의 HashCode : "+iArr3.hashCode());
		
		System.out.println(iArr == iArr2); // false
		System.out.println(iArr2 == iArr3); // true
		// 동등비교연산자 ==는 주소값을 비교한다.
		
		System.out.println(iArr.equals(iArr2));
	}
	
	public void method3() {
		int [] iArr = new int[5];
		
		// 배열 값 초기화
		// iArr.length : 배열의 크기를 저장하는 변수
		System.out.println(iArr.length); // 5
		
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = i;
		}
		// [0, 1, 2, 3, 4]
		System.out.println(iArr[4]); // 4
	}
	
	public void method4() {
		int result = 0;
		String str = null; // "";
		int [] arr = null;
		
		// null은 모든 참조자료형의 기본값이다.
		// 단, 참조변수가 null을 저장한 상태에서, 주소값이 있어야 수행할 수
		// 있는 행위를 코드로 작성하면 실행시 에러가 발생한다.
		
		// System.out.println(arr.length);
		// System.out.println(arr[0]);
		// arr[]의 크기도 null로 할당조차 안되어 있는데
		// arr[]의 길이(크기)와 데이터를 호출하면 없는 값을 내와야 하니 에러
	}
	
	public void method5() {
		int [] arr = new int[5];
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 * 
		 * 1. 반복문을 활용하여 배열 초기화 하기.
		 * 
		 * 2. 초기화 완료된 배열을 반복문을 활용하여 내부에 저장된 값을 출력
		 * 출력형식 : 10 8 6 4 2
		 */

		// 배열 초기화
		int a = 2;
		for(int i=0; i<arr.length; i++) {
			arr[i] = a; // 2+(2*i);
			a += 2;
		}
		
		// 값 출력
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
		// arr[5] = 12;
		// 배열의 크기를 벋어난 이넥스 제시시 에러 발생.
		// 배열은 한번 지정한 크기를 변경할 수 없다.
		// 배열의 범위를 넘어선 값들을 저장하고자 한다면, 새로운 배열을 생성해야한다.
		
		arr = new int[6];
		arr[5] = 12;
		// 작동은 하나 새롭게 만들었기에 기존 0~4번 인덱스 데이터는 0으로 초기화.
	}
	
	public void method6() {
		// 배열의 선언, 할당, 초기화를 한번에 수행하는 방법.
		// 1.
		int [] arr = new int[] {1, 2, 3, 4}; // 크기 4짜리 {1,2,3,4}배열이 생성
		
		// 2.
		int [] arr2 = {1, 2, 3, 4}; // new int[] 생략가능
	}
	
	public void method7() {
		// 문자열을 문자배열로 만드는 방법
		String str = "merry";
		
		// 1. toCharArray()함수 사용
		char[] arr = str.toCharArray(); // {'m','e','r','r','y'}
		
		// 2. for문으로 문자배열 생성하여 옮겨담기
		char[] arr2 = new char[str.length()];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = str.charAt(i);
		}
		
		int[] arr3 = new int[3];
		arr3[1] = 5;
		
		// Arrays.toString(배열) => 배열 내부의 값들을 문자열로 변환하여 반환하는 메서드.
		System.out.println(Arrays.toString(arr));
		System.out.println(arr2); // 문자열 저장은 데이터 출력
		System.out.println(arr3); // 정수 저장은 주소값 출력
		System.out.println(Arrays.toString(arr3));
	}
}














