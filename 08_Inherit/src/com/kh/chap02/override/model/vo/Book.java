package com.kh.chap02.override.model.vo;

public class Book /* extends Object */{
	private String title;
	private String author;
	private int price;
	
	public Book() {
		super(); // 상속받을 때 1순위로 해야할 것 : 부모클래스 호출
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메서드 오버라이딩
	/*
	 * 오버라이딩
	 *  - 상속받고 있는 부모클래스의 메서드를 자식클래스에서 재정의 하는 것
	 *  - 부모가 제공하고 있는 메서드를 자식이 일부 고쳐 사용하겠다는 의미로,
	 *    "자식메서드가 우선권"을 가진다.
	 *    
	 * 오버라이딩 성립조건
	 *  - 부모메서드의 메서드명과 동일해야한다.
	 *  - 매개변수의 자료형, 갯수, 순서도 모두 동일해야 한다.
	 *  - 반환형도 동일해야 한다.
	 *  - 부모메서드의 접근제한자보다 공유범위가 더 크거나 같아야 한다.
	 * 
	 * @Override 어노테이션
	 *  - 생략가능
	 *  - 잘못된 조건으로 오버라이드한 경우 오류를 통해 잘못됨을 알게 하기 위해서.
	 *  - 이 메서드가 오버라이딩된 메서드라는걸 알리기 위해서.
	 */
	
	@Override
	public String toString() {
		return title+", "+author+", "+price;
	}
}
