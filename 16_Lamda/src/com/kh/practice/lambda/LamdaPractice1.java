package com.kh.practice.lambda;

public class LamdaPractice1 {
	public static void main(String[] args) {
		String[] arr = {"java","lambda","hi","functional","wow"};
		printString(arr, str->str.length()<=3);
		printString(arr, str->str.contains("a"));
		printString(arr, str->str.startsWith("w"));
		printString(arr, str->str.length()%2==0 && str.contains("a"));
	}
	
	public static void printString(String[] arr, StringChecker checker) {
		for(String str : arr) {
			if(checker.check(str)) {
				System.out.println(str);
			}
		}
	}
	
	@FunctionalInterface
	interface StringChecker{
		boolean check(String str);
	}
}
