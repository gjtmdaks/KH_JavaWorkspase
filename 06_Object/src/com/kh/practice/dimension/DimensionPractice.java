package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		String[][]arr = new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "("+i+", "+j+")";
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][]arr = new int[4][4];
		
		int a = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = a++;
			}
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int[][]arr = new int[4][4];
		
		int a = 16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = a--;
			}
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][]arr = new int[4][4];
		
		for(int i=0; i<arr.length-1; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				if(j!=3) {
					arr[i][j] = (int)(Math.random()*10+1);
					sum += arr[i][j]; // 00 + 01 + 02 = 03
				}else arr[i][j] = sum;
			}
		}
		
		// 00 + 10 + 20 = 30
		for(int j=0; j<arr[0].length; j++) {
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				if(i!=3) {
					sum += arr[i][j];
				}else if(i==3) arr[i][j] = sum;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		System.out.print("행 크기 : ");
		int r = sc.nextInt(); // row
		System.out.print("열 크기 : ");
		int c = sc.nextInt(); // column
		
		// A=65 ~ Z=90 => 65+25(0~25)
		if((r>=1 && r<=10) || (c>=1 && c<=10)) {
			char[][]arr = new char[r][c];
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					int random = (int)(Math.random()*25);
					arr[i][j] = (char)('A'+random);
				}
			}

			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}else {
			System.out.println("반드시  1~10 사이의 정수를 입력해야 합니다.");
			practice5();
			return;
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][]
				{{"이","까","왔","앞","힘"},
				{"차","지","습","으","냅"},
				{"원","열","니","로","시"},
				{"배","심","다","좀","다"},
				{"열","히","! ","더","!! "}};
		/*
		 * 이 차 원 배 열	00 10 20 30 40
		 * 까 지 열 심 히	01 11 21 31 41
		 * 왔 습 니 다 !	02 12 22 32 42
		 * 앞 으 로 좀 더	03 13 23 33 43
		 * 힘 냅 시 다 !!	04 14 24 34 44
		 */

		for (int j = 0; j < strArr[0].length; j++) {
			for (int i = 0; i < strArr.length; i++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		System.out.print("행 크기 : ");
		int r = sc.nextInt(); // row
		
		char[][]arr = new char[r][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"행의 열 크기 : ");
			arr[i] = new char[sc.nextInt()]; // column
		}
		int a = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (char)('a'+a++);
			}
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
	}
	
	public void practice9() {
		
	}
}
