package com.ts.BooksKart;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.OrderDetaisDao;
import com.model.Book;
import com.model.OrderDetails;
import com.model.Orders;
import com.model.User;

@RestController
public class OrderDetailsController {
	
	@Autowired
	OrderDetaisDao orderDetailsDao;
	
	@RequestMapping("/setOrderDetails")
	public String giveOrderDetails(){
		
		OrderDetails orderDetails = new OrderDetails(1, 150);
		
		User user1 = new User("mkr","munagala@gmail.com","982342233","guntur","mkr123","password");
		user1.setUserId(1);
		
		Orders order1 = new Orders("Pending",new Date(2021-04-03));
		order1.setOrderId(1);
		order1.setUser(user1);
		
		orderDetails.setOrder(order1);
	
		User user3 = new User("krishna","krishna123@gmail.com","982342235","guntur","krishna123","password");
		user3.setUserId(3);
		
		Book book3 = new Book("Once upon a time", "medal", "12th",2019, 150, "wall street ",
				"In Stock", "history");
		book3.setBookId(3);
		book3.setUser(user3);
		
		orderDetails.setBook(book3);
		
		orderDetailsDao.setOrderDetails(orderDetails);
		
		return "succesfully given orders" ;
	}
	
	@RequestMapping("/showOrderDetails")
	public List<OrderDetails> showOrderDetails(){
	
		return orderDetailsDao.showOrderDetails();
	}
	
	

}
