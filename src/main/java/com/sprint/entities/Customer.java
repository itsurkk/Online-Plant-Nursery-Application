package com.sprint.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;

	@Size(min = 4, max = 20, message = "Name of the Customer must have 4 to 20 Characters")
	private String customerName;

	@Email(message = "Invalid Email")
	private String customerEmail;

	private String userName;
	private String password;

	// CUSTOMER MAPPED WITH ADDRESS
	@OneToOne(cascade = CascadeType.ALL)
	private @Valid Address address;

	public Customer() {
		super();
	}

	public Customer(int customerId,
			@Size(min = 4, max = 20, message = "Name of the Customer must have 4 to 20 Characters") String customerName,
			@Email(message = "Invalid Email") String customerEmail, String userName, String password,
			@Valid Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.userName = userName;
		this.password = password;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", userName=" + userName + ", password=" + password + ", address=" + address + "]";
	}
	
}
