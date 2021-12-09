package com.sprint.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.dao.IOrderRepository;
import com.sprint.entities.Orders;


@Service
public class IOrderServiceImpl implements IOrderService {
	@Autowired
	private IOrderRepository repository;

	// Adds an order to the database
	@Override
	public Orders addOrder(Orders order) {
		return repository.save(order);
	}

	// Updates the entities in order
	@Override
	public Orders updateOrder(Orders order) {
		Orders ord = repository.findById(order.getBookingOrderid())
				.orElseThrow(() -> new EntityNotFoundException("Currently no orders available with this id"));
		ord.setQuantity(order.getQuantity());
		return repository.save(ord);
	}

	// Deletes order by Id
	@Override
	public Orders deleteOrder(int orderId) {
		repository.findById(orderId)
				.orElseThrow(() -> new EntityNotFoundException("Currently no orders available with this id"));
		repository.deleteById(orderId);
		return null;
	}

	// View order based on Id
	@Override
	public Orders viewOrder(int orderId) {
		Orders ord = repository.findById(orderId)
				.orElseThrow(() -> new EntityNotFoundException("Currently no orders available with this id"));
		return ord;
	}

	// View all the orders
	@Override
	public List<Orders> viewAllOrders() {
		List<Orders> ord = repository.findAll();
		if (ord.isEmpty()) {
			throw new NullPointerException("Currently no orders available");
		}
		return ord;
	}

}
