package com.kh.chap01.oneVsMany.model.vo;

public class Book {
	// 도서명, 저자명, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// 각 필드에 대한 getter/setter메서드들.
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	
	public String information() {
		String result = "도서명 : "+title+
						"저자명 : "+author+
						"가격 : "+price+
						"출판사 : "+publisher;
		return title+", "+author+", "+price+", "+publisher;
	}
}
