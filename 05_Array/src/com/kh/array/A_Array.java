package com.kh.array;

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
		 * Heap은 공유메모리로 빈공간이 있으면 안됨.
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
		 * 매소드 내부 변수 선언 시 Stack에 생성
		 * int, byte, long 등 지역변수들
		 */
		int [] iArr = new int[5]; // [0,0,0,0,0]
		/*
		 * 배열 생성 후 크기 할당하면 기본값으로 강제 초기화 되고
		 * Stack에 배열의 주소값으로 변수생성되어 Stack을 통해 Heap의 배열로 접근
		 */
		System.out.println("iArr : "+iArr); // 배열에 저장한 값이 아닌 주소값
		System.out.println("iArr의 HashCode : "+iArr.hashCode());
		// 주소값을 10진수 형태로 변경해주는 함수
		
		int [] iArr2 = new int[5]; //[0,0,0,0,0]
		System.out.println("iArr2 : "+iArr2); // iArr과 상관없는 새로운 값
		System.out.println("iArr2의 HashCode : "+iArr2.hashCode());
		
		int [] iArr3 = iArr2; // 얕은 복사
		System.out.println("iArr3 : "+iArr3); // iArr2와 같은 주소값
		System.out.println("iArr3의 HashCode : "+iArr3.hashCode());
	}
}














