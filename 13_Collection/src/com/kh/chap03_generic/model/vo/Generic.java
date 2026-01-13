package com.kh.chap03_generic.model.vo;

// 현재 클래스에서 사용할 타입변수 지정
public class Generic < T , G > {
	/*
	 * 제네릭 설정방법
	 *  - 제네릭(타입변수)는 여러 참조자료형으로 대체될 수 있는 부분을 하나의 문자로 표현한다.
	 *  EX) <T>, <G>, ...
	 *  - 제네릭은 class 및 method, 필드에 각각 지정할 수 있다.
	 */
	T t;
	G g;
	// 추후 사용자에 의해 지정될 예정이며 지정이 안될 경우 Object로 자동 처리
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}

	public G getG() {
		return g;
	}

	public void setG(G g) {
		this.g = g;
	}
	
	// 메서드레벨 제네릭 설정
	public static <V> void printTest(V item) {
		System.out.println(item);
	}
}
