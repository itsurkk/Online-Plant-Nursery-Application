package com.plantnursery.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Order 
{
	@Id
	private Integer bookingOrderId;
	private LocalDate orderDate;
	private String transactionMode;
	private int quantity;
	private double totalCost;
	@ManyToOne
	private Planter planter;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Integer bookingOrderId, LocalDate orderDate, String transactionMode, int quantity, double totalCost,
			Planter planter) {
		super();
		this.bookingOrderId = bookingOrderId;
		this.orderDate = orderDate;
		this.transactionMode = transactionMode;
		this.quantity = quantity;
		this.totalCost = totalCost;
		this.planter = planter;
	}
	/**
	 * @return the bookingOrderId
	 */
	public Integer getBookingOrderId() {
		return bookingOrderId;
	}
	/**
	 * @param bookingOrderId the bookingOrderId to set
	 */
	public void setBookingOrderId(Integer bookingOrderId) {
		this.bookingOrderId = bookingOrderId;
	}
	/**
	 * @return the orderDate
	 */
	public LocalDate getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return the transactionMode
	 */
	public String getTransactionMode() {
		return transactionMode;
	}
	/**
	 * @param transactionMode the transactionMode to set
	 */
	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the totalCost
	 */
	public double getTotalCost() {
		return totalCost;
	}
	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	/**
	 * @return the planter
	 */
	public Planter getPlanter() {
		return planter;
	}
	/**
	 * @param planter the planter to set
	 */
	public void setPlanter(Planter planter) {
		this.planter = planter;
	}
	@Override
	public String toString() {
		return "Order [bookingOrderId=" + bookingOrderId + ", orderDate=" + orderDate + ", transactionMode="
				+ transactionMode + ", quantity=" + quantity + ", totalCost=" + totalCost + ", planter=" + planter
				+ "]";
	}
	

}
	