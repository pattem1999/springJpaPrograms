package com.covalense.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.covalense.main.Model.User;
import com.covalense.main.Service.UserService;
import com.covalense.main.Service.UserServiceImp;

@SpringBootApplication
public class SpringAggregateDemoApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringAggregateDemoApplication.class, args);
	}

	@Autowired
	UserServiceImp us;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	
		
		
		
	}

}
