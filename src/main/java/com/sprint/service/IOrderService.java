package com.sprint.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sprint.entities.Orders;



@Service
public interface IOrderService {
	Orders addOrder(Orders order);

	Orders updateOrder(Orders order);

	Orders deleteOrder(int orderId);

	Orders viewOrder(int orderId);

	List<Orders> viewAllOrders();
}
