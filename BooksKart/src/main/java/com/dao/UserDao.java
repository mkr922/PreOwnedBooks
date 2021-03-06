package com.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserDao {
	
	//Dependency Injection
	
	@Autowired
	UserRepository userRepository;;

	public void register(List<User> userList) {
		userRepository.saveAll(userList);
		System.out.println("registerd");
	}

	public List<User> getProducts() {

		System.out.println("userRepository : " + userRepository);		
		List<User> userList = userRepository.findAll();	
		return userList;
	}

	public User getProductById(Integer userId) {
		return userRepository.findById(userId).orElse(new User());
	}

}
