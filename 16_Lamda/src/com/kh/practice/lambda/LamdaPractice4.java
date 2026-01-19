package com.kh.practice.lambda;

public class LamdaPractice4 {
	public static void main(String[] args) {
		MyFunction2<String, Integer> printer = (name, score) -> {
			char grade = 'F';
			if(score>=90) grade = 'A';
			else if(score>=80) grade = 'B';
			else if(score>=70) grade = 'C';
			else if(score>=60) grade = 'D';
			
			System.out.printf("%s님의 점수는 %s학점(%d)입니다.\n", name, grade, score);
		};
		
		printer.accept("홍길동", 95);
		printer.accept("이순신", 88);
	}
	
	@FunctionalInterface
	interface MyFunction2<K, A>{
		void accept(K k, A a);
	}
}
