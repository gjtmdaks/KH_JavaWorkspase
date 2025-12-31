package com.kh.chap02.override.run;

import com.kh.chap02.override.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book bk1 = new Book("수학의 정석", "수학수학", 10000);
		System.out.println(bk1);
		// println(Object); = 해당 object의 toString()메소드를 실행
		
		/*
		 * 출력문 안에 참조변수를 제시하여 출력하는 경우, 내부적으로 항상
		 * toString()메서드가 호출되며 그 결과값이 출력된다.
		 * 
		 * public String toString() {
         * 		return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	 * }
    	 * toString()메서드는 부모클래스인 Object클래스에 존재하며,
    	 * 풀클래스명+@+주소값을 문자열로 반환하는 메서드.
    	 * 
    	 * 이 메서드를 오버라이딩하면, 참조변수를 제시하는것 만으로 객체 내부의
    	 * 값들을 한번에 출력문으로 받아볼 수 있다.
		 */
	}
}
