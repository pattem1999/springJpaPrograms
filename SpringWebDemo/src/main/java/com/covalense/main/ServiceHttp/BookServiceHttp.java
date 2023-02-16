package com.covalense.main.ServiceHttp;

import java.util.List;

import com.covalense.main.Model.Book;

public interface BookServiceHttp 
{

	public void addBook(Book book);
	
	public Book getById(Integer bid);
	
	public List<Book> getByAuthor(String author);
	public List<Book> getByCategory(String Category);
	
}
