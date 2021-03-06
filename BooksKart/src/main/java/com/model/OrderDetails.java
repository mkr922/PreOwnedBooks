package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderDetailsId;
	private int quantity;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="bookId")
	Book book;
	
	@ManyToOne
	@JoinColumn(name="orderId")
	Orders orders;

	public OrderDetails(int quantity, double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Orders getOrder() {
		return orders;
	}

	public void setOrder(Orders orders) {
		this.orders = orders;
	}
	
	
	
}
