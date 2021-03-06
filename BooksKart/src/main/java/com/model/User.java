package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	
	// fields	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String emailId;
	private String mobile;
	private String address;
	@Column(unique=true)
	private String loginId;
	private String password;
	
	@OneToMany(mappedBy="user",fetch = FetchType.LAZY)
	@Fetch(value=FetchMode.SUBSELECT)
	@JsonIgnore
	List<Book> booklist;
	
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	@Fetch(value=FetchMode.SUBSELECT)
	@JsonIgnore
	List<Orders> orderList;
	
	
	public User( String userName, String emailId, String mobile, String address, String loginId,
			String password) {
		super();
//		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.mobile = mobile;
		this.address = address;
		this.loginId = loginId;
		this.password = password;
	}

	public User() {
		super();
	}


	public List<Book> getBooklist() {
		return booklist;
	}

	public List<Orders> getOrderList() {
		return orderList;
	}

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
		
}
