package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}
	
	public String afterToken(String str) {
		// StringTokenizer, spilt, replace 등
		// 방법 1. replace
		System.out.println("replace : " + str.replace(" ", "")); // " "공백을 ""제거한다.
		// 방법 2. split(" ")을 활용하여 " "기준 문자를 불리하고, 분리된 문자를 다시 하나로 합친다.
		String[] sp = str.split(" "); // [j,a,v,a...]
		String result1 = "";
		for(String s : sp) {
			result1 += s;
		}System.out.println("split : " + result1);
		
		// 방법 3. StringTokenizer 이용
		StringTokenizer st = new StringTokenizer(str, " ");
		String result = "";
		
		while(st.hasMoreTokens()) {
			result += st.nextToken();
		}
		
		return result;
	}
	
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫번째 글자만 대문자
		// 방법 1. substring으로 문자를 하나 빼고, 대문자로 변경후 합쳐서 반환
		String first = input.substring(0, 1).toUpperCase().concat(input.substring(1));
		String other = input.substring(1);
		
		// 방법 2. 배열화, 0번째 인덱스 변경, 문자열화
		String result = "";
		char[] arr = input.toCharArray();
		
		arr[0] = input.toUpperCase().charAt(0);
		
		result = String.valueOf(arr);
		
		return result;
		
		// 방법 3.
		// return input.toUpperCase().charAt(0) + input.substring(1);
	}
	
	public int findChar(String input, char one) {
		char[] arr = input.toCharArray();
		int count = 0;
		
		for(char ch : arr) {
			if(ch==one) {
				count++;
			}
		}
		return count;
	}
}
