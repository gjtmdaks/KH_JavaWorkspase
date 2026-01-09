package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	private BookDAO db = new BookDAO();

	public void makeFile() {
		try {
			new File("book.txt").createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileSave(Book[] bArr) {
		db.fileSave(bArr);
	}

	public Book[] fileRead() {
		return db.fileRead();
	}
}
