package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Book;

@Service
public class BookDao {
	
	@Autowired
	BookRepository bookRepository;

	public void addBook(List<Book> bookList) {
		bookRepository.saveAll(bookList);
		System.out.println("added");
	}

	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	public Book getProductByName(String bookName) {
		Book book = bookRepository.findByBookName(bookName).orElse(new Book());
		return book;
	}

}
