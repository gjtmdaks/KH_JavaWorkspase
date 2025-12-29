package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class C_DimensionalArray {
	Scanner sc = new Scanner(System.in);

	public void method1() {
		/*
		 * 이차원 배열 선언
		 * [표현법]
		 * 1. 자료형 배열명[][];
		 * 2. 자료형 [] 배열명 [];
		 * 3. 자료형 [][] 배열명;
		 */
		int arr1[][];
		int []arr2[];
		int [][] arr3;
		
		/*
		 * 이차원 배열 할당(크기지정)
		 * 배열명 = new 자료형[형크기][열크기];
		 * 배열명 = new 자료형[2차원배열크기][1차원배열크기];
		 */
		arr3 = new int[2][3];
		/*
		 * -------		-------------
		 * |1|2|3|		|0,0|0,1|0,2|
		 * -------		-------------
		 * |2| | |		|1,0|1,1|1,2|
		 * -------		-------------
		 */
		
		// 이차원배열 선언과 동시에 할당
		int[][] arr = new int[3][5];
		/*
		 * [0,0,0,0,0]
		 * [0,0,0,0,0]
		 * [0,0,0,0,0]
		 */
		
		System.out.println(arr); // 2차원배열의 주소값
		System.out.println(arr[0]); // 1행의 주소값
		System.out.println(arr[0][0]); // 1행 1열의 값
		
		System.out.println(arr.length); // 3(2차원배열의 길이 = 행 길이)
		System.out.println(arr[0].length); // 5(1행의 길이 값 = 열 길이)
		
		// 중첩반복문을 활용한 2차원 배열 순회
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		/*
		 * 1행 [1,2,3,4,5]
		 * 2행 [6,7,8,9,10]
		 * 3행 [11,12,13,14,15]
		 * 2차원 배열을 선언 및 할당하고, 위 데이터형식으로 초기화시키시오.
		 */
		
		int [][] arr = new int[3][5];
		int value = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ++value;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public void method3() {
		// 배열 선언 및 할당과 초기화
		int[] iArr = {1,2,3,4,5};
		
		int[][] arr = {{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15}};
		
		// 가변배열
		//  - 행의 크기는 정해져 있으나, 행별 열의 갯수가 정해지지 않은 배열을 의미함.
		//  - 이차원배열은 1차원배열을 여러개 묶음으로 관리하는 형태긴 하지만, 일차원배열의
		//    크기가 꼭 같을 필요는 없음.
		int [][] arr2 = new int[3][];
		
		System.out.println(arr2); // 2차원 배열의 주소값
		System.out.println(arr2[0]); // null 1차원 배열이 안만들어짐
		
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[1];
		
		int value = 1;
		for(int i=0; i<arr2.length; i++) {
			// arr2[i] => 각 행별 1차원 배열
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = value++;
			}
			System.out.println(Arrays.toString(arr2[i]));
		}
	}
	
	public void method4() {
		/*
		 * char[][] 가변배열을 생성 후 문자를 저장하시오.
		 * 
		 * 최종 출력 형태
		 * 1행 [a,b,c]
		 * 2행 [d,e]
		 * 3행 [f,g,h,i]
		 */
		
		char[][] arr = new char [3][];
		
		arr[0] = new char[3];
		arr[1] = new char[2];
		arr[2] = new char[4];
		
		char value = 'a';
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				//arr[i][j] = sc.next().charAt(0);
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		*/
	}
}
