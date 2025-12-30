package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		String[][]arr = new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "("+i+", "+j+")";
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
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][]arr = new int[4][4];
		/*
		for(int i=0; i<arr.length-1; i++) { // 3행은 제외
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				if(j!=3) {
					// (0,0) ~ (2,2) 난수 생성 후 저장
					arr[i][j] = (int)(Math.random()*10+1);
					
					sum += arr[i][j]; // 00 + 01 + 02 = 03
				}else arr[i][j] = sum;
			}
		}
		
		// 00
		//+10
		//+20
		//-----
		//=30
		for(int j=0; j<arr[0].length; j++) {
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				if(i!=3) {
					sum += arr[i][j];
				}else if(i==3) arr[i][j] = sum;
			}
		}
		*/
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				// (0,0)~(2,2) 난수 입력 후 각 행,열의 끝에 값을 더한다
				arr[i][j] = (int)(Math.random()*10+1);
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j]*2;
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
		
		if(!(r>=1 && r<=10 && c>=1 && c<=10)) {
			System.out.println("반드시  1~10 사이의 정수를 입력해야 합니다.");
			practice5();
			return;
		}
		
		// A=65 ~ Z=90 => 65+25(0~25)
		char[][]arr = new char[r][c];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int random = (int)(Math.random()*26);
				arr[i][j] = (char)('A'+random);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
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
		String[]arr = {"강건강","남나나","도대담","류라라","문미미","박보배",
						"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][]arr1 = new String[3][2];
		String[][]arr2 = new String[3][2];
		
		int index = 0;
		for (int i=0; i<arr1.length; i++) {
	        for (int j=0; j<arr1[i].length; j++) {
	            arr1[i][j] = arr[index++];
	        }
	    }
		for (int i=0; i<arr2.length; i++) {
	        for (int j=0; j<arr2[i].length; j++) {
	            arr2[i][j] = arr[index++];
	        }
	    }

		System.out.println("== 1분단 ==");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		practice8();
		String[] arr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
						"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int index = 0;
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = arr[index++];
			}
		}
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = arr[index++];
			}
		}
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				String a = "";
				String b = "";
				
				switch(i) {
				case 0:
					a = "첫";
					break;
				case 1:
					a = "두";
					break;
				case 2:
					a = "세";
					break;
				}
				switch(j) {
				case 0:
					b = "왼쪽";
					break;
				case 1:
					b = "오른쪽";
					break;
				}
				if(arr1[i][j].equals(name)) {
					System.out.println("검색하신 "+name+" 학생은 1분단 "+a+" 번째 줄 "+b+"에 있습니다.");
				}else {
					break;
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				String a = "";
				String b = "";
				
				switch(i) {
				case 0:
					a = "첫";
					break;
				case 1:
					a = "두";
					break;
				case 2:
					a = "세";
					break;
				}
				switch(j) {
				case 0:
					b = "왼쪽";
					break;
				case 1:
					b = "오른쪽";
					break;
				}
				if(arr2[i][j].equals(name)) {
					System.out.println("검색하신 "+name+" 학생은 2분단 "+a+" 번째 줄 "+b+"에 있습니다.");
				}
			}
		}
	}
}
