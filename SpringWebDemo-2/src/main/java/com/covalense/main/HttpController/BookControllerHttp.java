package com.covalense.main.HttpController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.main.Model.Book;
import com.covalense.main.Service.BookService;

@RestController
@RequestMapping("/bookRest")
public class BookControllerHttp {
	
	@Autowired
	BookService bs;
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello()
	{
		String msg="welcome to book App";
		HttpHeaders headers=new HttpHeaders();
		
		headers.add("desc", "online portal available");
		return new ResponseEntity<String>(msg,headers,HttpStatus.OK);
	}
	
	@GetMapping("/book-by-id/{bid}")
	public ResponseEntity<Book> getById(@PathVariable Integer bid)
	{
		System.out.println("book by id ");
		Book book=bs.getById(bid);
		HttpHeaders header=new HttpHeaders();
		header.add("desc", "book available");
		
		return ResponseEntity.status(HttpStatus.OK).headers(header).body(book);	}
	
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book  book)
	{
		bs.addBook(book);
		HttpHeaders header=new HttpHeaders();
		header.add("desc", "one book was added");
		
		return ResponseEntity.status(HttpStatus.OK).headers(header).body(book);
	}
}
