package com.covalense.main.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	private Integer id;
	
	private String name;
	
	private String city;
	
	private String status;
	
	
}
