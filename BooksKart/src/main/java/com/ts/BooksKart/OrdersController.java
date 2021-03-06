package com.ts.BooksKart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.OrdersDao;
import com.model.Orders;
import com.model.User;

@RestController
public class OrdersController {
	
	@Autowired
	OrdersDao ordersDao;
	
	@RequestMapping("/makeOrders")
	public String makeOrder(){
		
		
		User user1 = new User("mkr","munagala@gmail.com","982342233","guntur","mkr123","password");
		user1.setUserId(1);
		
		User user2 = new User("ram","ram123@gmail.com","982342234","guntur","ram123","password");
		user2.setUserId(2);
		
		User user3 = new User("krishna","krishna123@gmail.com","982342235","guntur","krishna123","password");
		user3.setUserId(3);
		
		Orders order1 = new Orders("Pending",new Date(2021-04-03));
		order1.setUser(user1);
		Orders order2 = new Orders("Pending",new Date(2021-04-03));
		order2.setUser(user2);
		Orders order3 = new Orders("Pending",new Date(2021-04-03));
		order3.setUser(user3);
		
		List<Orders> ordersList = new ArrayList<Orders>(); 
		ordersList.add(order1);
		ordersList.add(order2);
		ordersList.add(order3);
		
		ordersDao.makeOrder(ordersList);
		return "made order succesfull";
		
	}
	
	@RequestMapping("/showOrders")
	public List<Orders> showOrders(){
		List<Orders> orderList = ordersDao.showOrders();
		return orderList;
	}
}
