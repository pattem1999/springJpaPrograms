package com.covalense.main.ServiceHttp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.covalense.main.Model.Book;
@Service
public class BookServicehttpImp implements BookServiceHttp {

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub

	}
	
	public List<Book> getAllBooks()
	{
		
		return Arrays.asList(new Book(1,"java","gf","enginer"),
				new Book(2,"spring","gf","enginer"),
				new Book(3,"hibernate","gf","enginer")
				,new Book(4,"Oracle","gf","enginer")
				
				
				);
	}

	@Override
	public Book getById(Integer bid) {
		// TODO Auto-generated method stub
		
		
		return getAllBooks().stream()
				.filter(book->book.getBid()==bid).findAny().get();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return getAllBooks()
			   .stream()
			   .filter((book)->book.getAuthor().equals(author))
			   .collect(Collectors.toList());
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return getAllBooks()
				.stream()
				   .filter((book)->book.getCategory().equals(category))
				   .collect(Collectors.toList());
	}

}
