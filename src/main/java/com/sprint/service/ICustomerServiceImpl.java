package com.sprint.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.dao.ICustomerRepository;
import com.sprint.entities.Customer;


@Service
public class ICustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository repository;

	// ADD CUSTOMER
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	// UPDATE CUSTOMER
	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer cust = repository.findById(customer.getCustomerId())
				.orElseThrow(() -> new EntityNotFoundException("Currently No Customer is available with this id"));
		cust.setCustomerEmail(customer.getCustomerEmail());
		return repository.save(cust);
	}

	// DELETE CUSTOMER
	@Override
	public Customer deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repository.findById(customer.getCustomerId())
				.orElseThrow(() -> new EntityNotFoundException("Currently No Customer is available with this id"));
		repository.delete(customer);
		return null;
	}

	// VIEW ALL CUSTOMER
	@Override
	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> cust = repository.findAll();
		if (cust.isEmpty()) {
			throw new NullPointerException("Currently No Customers are available..");
		}
		return cust;
	}

	// VALIDATE CUSTOMER
	@Override
	public boolean validateCustomer(String userName, String password) {
		// TODO Auto-generated method stub
		return true;
	}

	// VIEW CUSTOMER BY ID
	@Override
	public Customer viewCustomer(int customerId) {
		// TODO Auto-generated method stub
		Customer cust = repository.findById(customerId)
				.orElseThrow(() -> new EntityNotFoundException("Currently No Customer is available with this id"));
		return cust;
	}

}
