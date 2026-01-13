package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book implements Comparable {
	private String title;
	private String author;
	private String categoty;
	private int price;
	
	public Book() {
		super();
	}

	public Book(String title, String author, String categoty, int price) {
		super();
		this.title = title;
		this.author = author;
		this.categoty = categoty;
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

	public String getCategoty() {
		return categoty;
	}

	public void setCategoty(String categoty) {
		this.categoty = categoty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "(" + title + "/" + author + "/" + categoty + "/" + price + ")";
	}

	@Override
	public int hashCode() {
		// 전통적인 hashCode 생성방식
		/*
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + (title ==null ? 0 : title.hashCode());
		result = prime * result + (author ==null ? 0 : author.hashCode());
		result = prime * result + (categoty ==null ? 0 : categoty.hashCode());
		return result;
		*/
		return Objects.hash(author, categoty, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		// 전통적인 equals 생성방식
		/*
		if(!(obj instanceof Book)) {
			return false;
		}
		Book b = (Book) obj;
		
		if(this.title.equals(b.title)
				&& this.author.equals(b.author)
				&& this.categoty.equals(b.categoty)
				&& this.price == b.price) {
			return true;
		}
		return false;
		*/
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author)
				&& Objects.equals(categoty, other.categoty)
				&& price == other.price
				&& Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Object o) {
		// return this.title.compareTo(((Book)o).getTitle());
		
		Book b = (Book)o;
		
		int result = this.title.compareTo(b.title);
		
		if (result == 0) {
			result = this.author.compareTo(b.author);
		}
		return result;
	}
}
