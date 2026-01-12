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
		return "Book [title=" + title + ", author=" + author + ", categoty=" + categoty + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, categoty, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(categoty, other.categoty) && price == other.price
				&& Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Object o) {
		Book b = (Book)o;
		
		int result = this.title.compareTo(b.title);
		
		if (result == 0) {
			result = this.author.compareTo(b.author);
		}
		return result;
	}
}
