package com.kh.practice.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LamdaPractice6 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jin","Suga","RM","J-Hope","V");
		
		Comparator<String> comp = getComparator("length");
		names.sort(comp);
		System.out.println(names); // 길이순 정렬
		
		comp = getComparator("reverse");
		names.sort(comp);
		System.out.println(names); // 알파벳 역순 정렬
	}
	
	public static Comparator<String> getComparator(String mode){
		Comparator<String> comp = null;
		switch(mode) {
		case "length" -> comp = (a,b) -> a.length() - b.length();
		case "reverse" -> comp = (a,b) -> b.compareTo(a);
		default -> throw new RuntimeException("존재하지 않는 정렬기준입니다.");
		}
		return comp;
		
//		if(mode.equals("length")) {
//			return (a,b) -> {
//				if(a.length()<b.length()) {
//					return -1;
//				}
//				else if(a.length()==b.length()) {
//					return 0;
//				}
//				else {
//					return 1;
//				}
//			};
////			return (a,b) -> Integer.compare(a.length(), b.length());
//		}
//		else if(mode.equals("reverse")) {
//			return (a,b) -> b.compareTo(a);
//		}
//		return null;
	}
}
