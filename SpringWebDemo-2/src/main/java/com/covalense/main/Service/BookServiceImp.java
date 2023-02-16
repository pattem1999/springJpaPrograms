package com.covalense.main.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.covalense.main.Model.Book;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
@Service
public class BookServiceImp implements BookService {

	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println(book);
	}

	@Override
	public Book getById(Integer bid) {
		// TODO Auto-generated method stub
		return (Book)getAllBooks()
		.stream()
		.filter((book)->book.getBid()==bid)
		.findAny().get();

	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByCategory(String Category) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Book> getAllBooks()
	{
		
		return Arrays.asList(new Book(Integer.valueOf(1),"java","gf","enginer"),
				new Book(Integer.valueOf(2),"spring","gf","enginer"),
				new Book(Integer.valueOf(3),"hibernate","gf","enginer")
				,new Book(Integer.valueOf(4),"Oracle","gf","enginer")
				
				
				);
	}


}
