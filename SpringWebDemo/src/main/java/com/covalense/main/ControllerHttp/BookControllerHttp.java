package com.covalense.main.ControllerHttp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.main.ServiceHttp.BookServiceHttp;



@RestController
@RequestMapping("book-rest-api1")
public class BookControllerHttp {

	@Autowired
	BookServiceHttp bsh;
	@GetMapping("/great")
	public ResponseEntity<String> sayHello()
	{
		String msg="hi good morning";
		HttpHeaders header=new HttpHeaders();
		header.add("desc","online book");
		
		return new ResponseEntity<String>(msg,header,HttpStatus.OK);
	}
	
	
}
