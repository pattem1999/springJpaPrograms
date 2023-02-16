package com.covalense.main.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.covalense.main.Model.Book;
@Service
public class BookServiceImp  implements BookService{

	//List<Book> vl=getVal();
	
	@Override
	public Book getById(Integer bid) {
		// TODO Auto-generated method stub
		return (Book) getVal()
				.stream()
				.filter((book)->book.getBid()==bid)
				.findAny().get();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return getVal().stream().filter((book)->book.getAuthor().equals(author)).collect(Collectors.toList());
	}

	@Override
	public List<Book> getByCatergory(String category) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static List<Book> getVal()
	{
		return Arrays.asList(new Book(Integer.valueOf(100),"java","srinivas","oracle")
				,new Book(Integer.valueOf(101),"hibernate","srinivas","microsoft")
				,new Book(Integer.valueOf(102),"oracle","srinivas","google"),
				new Book(Integer.valueOf(103),"php","srinivas","yuvi"));
	}

	@Override
	public void addBook(Book b) {
		System.out.println(b);
		
	}

}
