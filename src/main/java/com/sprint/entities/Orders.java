package com.sprint.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingOrderid;

//	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
//	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate orderDate;

	@NotBlank(message = "Transaction Mode Can't be null")
	private String transactionMode;

	@Min(value = 1, message = "Quantity can't be 0")
	private int quantity;

	@Min(value = 1, message = "Cost can't be 0")
	private double totalCost;

	// ORDERS MAPPED WITH PLANTERS
	@OneToOne(cascade = CascadeType.ALL)
	private @Valid Planter planters;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int bookingOrderid, LocalDate orderDate,
			@NotBlank(message = "Transaction Mode Can't be null") String transactionMode,
			@Min(value = 1, message = "Quantity can't be 0") int quantity,
			@Min(value = 1, message = "Cost can't be 0") double totalCost, @Valid Planter planters) {
		super();
		this.bookingOrderid = bookingOrderid;
		this.orderDate = orderDate;
		this.transactionMode = transactionMode;
		this.quantity = quantity;
		this.totalCost = totalCost;
		this.planters = planters;
	}

	public int getBookingOrderid() {
		return bookingOrderid;
	}

	public void setBookingOrderid(int bookingOrderid) {
		this.bookingOrderid = bookingOrderid;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Planter getPlanters() {
		return planters;
	}

	public void setPlanters(Planter planters) {
		this.planters = planters;
	}

	@Override
	public String toString() {
		return "Orders [bookingOrderid=" + bookingOrderid + ", orderDate=" + orderDate + ", transactionMode="
				+ transactionMode + ", quantity=" + quantity + ", totalCost=" + totalCost + ", planters=" + planters
				+ "]";
	}
	
}
