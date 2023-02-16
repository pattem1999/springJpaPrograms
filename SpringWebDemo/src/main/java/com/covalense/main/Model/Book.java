package com.covalense.main.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

@NoArgsConstructor
@ToString
public class Book {

	private Integer bid;
	
	private String bookname;
	
	
	private String author;
	
	private String category;

	public Book(Integer bid, String bookname, String author, String category) {
		super();
		this.bid = bid;
		this.bookname = bookname;
		this.author = author;
		this.category = category;
	}
	
	
	
}
