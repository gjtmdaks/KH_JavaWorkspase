package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.inform();
		
		Book b2 = new Book("바다와 노인", "찰스 스크리브너즈 선스", "어니스트 헤밍웨이");
		b2.inform();
		
		Book b3 = new Book("바다와 노인", "찰스 스크리브너즈 선스", "어니스트 헤밍웨이", 39000, 0.5);
		b3.inform();
	}
}
