package com.covalense.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.covalense.main.Service,com.covalense.main.Controller,com.covalense.main.ControllerHttp,com.covalense.main.ServiceHttp")
public class SpringWebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebDemoApplication.class, args);
	}

}
