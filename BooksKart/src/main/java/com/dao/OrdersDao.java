package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Orders;

@Service
public class OrdersDao {

	@Autowired
	OrdersRepository ordersRepository;
	public String makeOrder(List<Orders> ordersList) {
		ordersRepository.saveAll(ordersList);
		return "ordered";
	}
	
	public List<Orders> showOrders() {
		return ordersRepository.findAll();
	}

}
