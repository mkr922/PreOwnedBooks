package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.OrderDetails;

@Service
public class OrderDetaisDao {
	
	@Autowired
	OrderDetailsRepository orderDetailsRepository ;

	public String setOrderDetails(OrderDetails orderDetails) {
		
		orderDetailsRepository.save(orderDetails);
		return "saved";
	}

	public List<OrderDetails> showOrderDetails() {
		
		List<OrderDetails> orderDetailsList = orderDetailsRepository.findAll();
		return orderDetailsList;
	}
	
	
	
}