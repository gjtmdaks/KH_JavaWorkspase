package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int [] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length-i;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice2() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice3() {
		int [] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int a = (int)(Math.random() * 10 + 1);
			arr[i] = a;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		String [] arr = new String[7];
		arr[0] = "월요일";
		arr[1] = "화요일";
		arr[2] = "수요일";
		arr[3] = "목요일";
		arr[4] = "금요일";
		arr[5] = "토요일";
		arr[6] = "일요일";
		
		// String[] arr = {"월","화","수","목","금","토","일"}
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(!(num>=0 && num<=6)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println(arr[num]); //+"요일"
	}
	
	public void practice5() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println("\n총 합 : "+sum);
	}
	
	public void practice6() {
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		int count = 0;

		System.out.print("문자열에 있는 문자 : ");
		loop:
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) { // 중복이라면
					continue loop;	 // 패스하고 다음으로
				}
			}
			if(count>0) {			// a
				System.out.print(", "); // , b
			}							// , c
			System.out.print(arr[i]);
			count++;
		}
		System.out.println("\n문자 개수 : "+count);
		
		/*
		 * boolean isDup = false;
		 * for(int j=0; j<i; j++) {
		 *    if(arr[i]==arr[j]) {
		 *       isDup = true;
		 *       break;
		 *    }
		 * }
		 * if(!isDup) {
		 *    System.out.print(arr[i]+", ");
		 *    count++;
		 * }
		 */
	}
	
	public void practice7() {
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		char [] arr = str.toCharArray();
		int count = 0;
		
		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스) : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==ch) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\n"+ch+" 개수 : "+count);
	}
	
	public void practice8() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		
		char [] arr = str.toCharArray();
		char [] copy = arr.clone();
		// char [] copy = Arrays.copyOf(arr, arr.length);
		
		for(int i=0; i<copy.length; i++) {
			if(i>=8) {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
	}
	
	public void practice9() {
		int [] arr = new int[10];
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			int a = (int)(Math.random() * 10 + 1);
			arr[i] = a;
			System.out.print(arr[i]+" ");
			
			max = max > arr[i] ? max : arr[i];
			min = min > arr[i] ? arr[i] : min;
		}
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	
	public void practice10() {
		int[] arr = new int[10];

		loop:
		for (int i=0; i<arr.length; i++) {
			int a = (int)(Math.random() * 10 + 1);
			for(int j=0; j<i; j++) {
				if(a==arr[j]) { // 중복이라면
					i--;
					continue loop;	 // 패스하고 다음으로
				}
			}
			arr[i] = a;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num%2==0 || num<3) {
			System.out.println("다시 입력하세요.");
			practice11();
			return;
		}
		
		int [] arr = new int[num];
		/*
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<num/2; j++) {
				arr[i] = i+1;
			}
			for(int k=num/2+1; k<arr.length; k++) {
				arr[k] = num-k;
			}
			System.out.print(arr[i]+" ");
		}
		*/
		int mid = num/2;
		int value = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(i<=mid) {
				arr[i] = ++value;
			}else {
				arr[i] = --value;
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice12() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		
		String [] arr = new String[num];
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			arr[i] = sc.next();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);
			
			if(ch=='n' || ch=='N') {
				System.out.println(Arrays.toString(arr));
				break;
			}
			
			System.out.print("더 입력하고 싶은 개수 : ");
			int plus = sc.nextInt();
			
			String [] copy = Arrays.copyOf(arr, (arr.length+plus));

			for(int i=arr.length; i<copy.length; i++) {
				System.out.print((i+1)+"번째 문자열 : ");
				copy[i] = sc.next();
			}
			arr = copy; // 갱신된 배열로 주소 변경
		}
	}
	
	public void practice13() {
		System.out.print("배열 크기 : ");
		int num = sc.nextInt();
		
		String [] arr = new String [num];
		
		sc.nextLine(); // 개행문자 제거
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i + 1) + "번째 : ");
			arr[i] = sc.nextLine(); // 띄어쓰기 포함해서 스캔
		}

		while(true) {
			System.out.print("더 입력? ");
			char ch = sc.nextLine().charAt(0);
			
			if (ch == 'y' || ch == 'Y') {
				System.out.print("몇 개? ");
				int plus = sc.nextInt();
				String[] copy = Arrays.copyOf(arr, arr.length + plus);
				
				sc.nextLine();
				
				for (int i = arr.length; i < copy.length; i++) {
					System.out.print((i + 1) + "번째 : ");
					copy[i] = sc.nextLine();
				}
				arr = copy;
			}else {
				System.out.println(Arrays.toString(arr));
				break;
			}
		}
	}
}
