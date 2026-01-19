package com.kh.practice.lambda;

public class LamdaPractice3 {
	public static void main(String[] args) {
		MyFunction<String, String> first = String::toUpperCase;
		MyFunction<String, Boolean> second = str -> str.length()>=5;
		MyFunction<String, String> third = str -> {
			String[] arr = str.split(""); // 한글자씩 끊어짐

			StringBuilder sb = new StringBuilder();
			
			for(String s : arr) {
				sb.append(s).append("-");
			}
			sb.deleteCharAt(sb.length()-1);

//		    for (int i = 0; i < str.length(); i++) {
//		        sb.append(str.charAt(i));
//		        if (i < str.length() - 1) {
//		            sb.append("-");
//		        }
//		    }

		    return sb.toString();
		};
		
		System.out.println(first.apply("lambda"));
		System.out.println(second.apply("lambda"));
		System.out.println(third.apply("lambda"));
	}
	
	@FunctionalInterface
	interface MyFunction<V, B>{
		B apply(V v);
	}
}
