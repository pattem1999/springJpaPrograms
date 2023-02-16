package com.covalense.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.covalense.main.Model.User;

@Repository
public interface UserRepository  extends CrudRepository<User, Integer>
{

	@Query("select u from user u ")
	public List<User> getAllUser();
}
