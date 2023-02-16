package com.covalense.main.Service;

import java.util.List;

import com.covalense.main.Model.Book;

public interface BookService {

	
	Book getById(Integer bid);
	
	List<Book> getByAuthor(String author);
	
	List<Book> getByCatergory(String category);
	
	public void addBook(Book b);
	
}
