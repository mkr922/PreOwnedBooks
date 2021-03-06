package com.ts.BooksKart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.BookDao;
import com.model.Book;
import com.model.User;

@RestController
public class BookController {
	
	@Autowired
	BookDao bookDao;
	
	@RequestMapping("/addBooks")
	public String addBooks(){
		
		User user1 = new User("mkr","munagala@gmail.com","982342233","guntur","mkr123","password");
		user1.setUserId(1);
		
		User user2 = new User("ram","ram123@gmail.com","982342234","guntur","ram123","password");
		user2.setUserId(2);
		
		User user3 = new User("krishna","krishna123@gmail.com","982342235","guntur","krishna123","password");
		user3.setUserId(3);
		
		Book book1 = new Book("Richest Man In Babylona", "laren", "12th",2019, 150, "it's about the tale of a babylona city",
				"In Stock", "Finance");
		book1.setUser(user1);
		
		Book book2 = new Book("beat wallstreet", "mayor", "12th",2019, 150, "it's about how to beat market",
				"In Stock", "Finance");
		book2.setUser(user2);
		
		Book book3 = new Book("Once upon a time", "medal", "12th",2019, 150, "wall street ",
				"In Stock", "history");
		book3.setUser(user3);
		
		
		
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		bookDao.addBook(bookList);
		
		return "registration succesful";
	}
	
	@RequestMapping("/showAllBooks")
	public List <Book> showAllBooks(){
		
		List<Book> bookList = bookDao.getBooks();		
		return bookList;
	}
	
	@RequestMapping("/showBookByName/{bookName}")
	public Book showProductByName(@PathVariable("bookName") String bookName){		
		Book book = bookDao.getProductByName(bookName);
		return book;
	}

}
