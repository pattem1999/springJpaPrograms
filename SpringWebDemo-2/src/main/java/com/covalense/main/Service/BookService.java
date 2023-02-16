package com.covalense.main.Service;

import java.util.List;

import com.covalense.main.Model.Book;

public interface BookService {

public void addBook(Book book);
	
	public Book getById(Integer bid);
	public List<Book> getByAuthor(String author);
	public List<Book> getByCategory(String Category);
}
