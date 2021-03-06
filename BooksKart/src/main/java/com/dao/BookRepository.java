package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	Optional<Book> findByBookName(String bookName);

}
