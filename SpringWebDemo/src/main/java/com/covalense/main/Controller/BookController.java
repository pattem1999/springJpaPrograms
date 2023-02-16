package com.covalense.main.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.covalense.main.Model.Book;
import com.covalense.main.Service.BookService;

import lombok.Setter;

@RestController
@RequestMapping("book-restapi")
public class BookController {

	@Autowired
	@Setter
	BookService bservice;
	@GetMapping("/hello")
	public String sayHello()
	{
		return "hello localhost";
	}
	
	@GetMapping( "/book-by-id/{bid}")
	public Book getById(@PathVariable int bid) {
		 
		  return bservice.getById(bid);
	}
	
	@GetMapping("/book-by-author/{author}")
	public List<Book> getByAuthor(String author)
	{
		return bservice.getByAuthor(author);
	}
	
	@PostMapping("/books")
	
	public void addBook(@RequestBody Book b) {
		// TODO Auto-generated method stub
		bservice.addBook(b);
		HttpHeaders headers=new HttpHeaders();
		headers.add("description","adding one book");
		ResponseEntity.ok();
		System.out.println("successfully"+b);
		//return ResponseEntity.ok();
		
		
	}
	
	
}
