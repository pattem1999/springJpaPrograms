package com.covalense.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covalense.main.Model.User;
import com.covalense.main.Repository.UserRepository;

import lombok.Setter;

@Service
public class UserServiceImp  implements UserService{

	
	@Autowired
	@Setter
	UserRepository ur;
	@Override
	public List<User> getAllUser1() {
		// TODO Auto-generated method stub
		return ur.getAllUser();
	}

}
