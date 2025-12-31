package com.kh.chap01.oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01.oneVsMany.model.vo.Book;

public class ObjectRun {
	public static void main(String[] args) {
		// 객체배열 없이 코딩하기
		// 1. setter초기화
		Book bk1 = new Book();
		bk1.setTitle("DoIT 자바프로그래밍");
		bk1.setAuthor("자바");
		bk1.setPrice(20000);
		bk1.setPublisher("이지스퍼블리싱");
		
		// 2. 매개변수 생성자로 객체 생성 및 초기화
		Book bk2 = new Book("C언어", "민경민", 21000, "이지스");
		
		// 3. 매개변수 생성자로 객체 생성 및 초기화
		Book bk3 = new Book("원피스", "오다", 10000, "이지스");
		
		// 도서정보 출력서비스
		for(int i=0; i<3; i++) {
			if(i==0) {
				System.out.println(bk1.information());
			}
			else if(i==1) {
				System.out.println(bk2.information());
			}
			else {
				System.out.println(bk3.information());
			}
		}
		
		// 객체만 있는 상태에선 작업이 비효율적이므로, 배열에 넣어서 관리해줘야 한다.
		Book[] arr = new Book[3]; // [null, null, null]
		arr[0] = bk1;
		arr[1] = bk2;
		arr[2] = bk3;
		
		// 배열을 통해 도서정보 출력 서비스 만들기
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		Scanner sc = new Scanner(System.in);
		// 사용자에게 검색할 도서 제목을 입력받아 전체 도서목록들 중 일치하는 제목의 도서 찾기
		System.out.print("검색할 책의 제목 : ");
		String searchTitle = sc.next();

		// 객체배열 사용. 반복문 사용.
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getTitle().equals(searchTitle)) {
				System.out.println(arr[i].information());
			}else {
				System.out.println("해당 도서는 존재하지 않습니다.");
			}
		}
	}
}
