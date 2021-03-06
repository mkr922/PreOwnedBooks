package com.ts.BooksKart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.model.User;

@RestController
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/registerUser")
	public void registerUser(){
		User user1 = new User("mkr","munagala@gmail.com","982342233","guntur","mkr123","password");
		User user2 = new User("ram","ram123@gmail.com","982342234","guntur","ram123","password");
		User user3 = new User("krishna","krishna123@gmail.com","982342235","guntur","krishna123","password");
		
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
	
		userDao.register(userList);
	}
	
	@RequestMapping("/showAllUsers")
	public List <User> showAllUsers(){
		List <User> userList = userDao.getProducts();
		return userList;
	}
	
	@RequestMapping("/showUserById/{userId}")
	public User showProductById(@PathVariable("userId") Integer userId){		
		User user = userDao.getProductById(userId);
		return user;
	}
	
}
