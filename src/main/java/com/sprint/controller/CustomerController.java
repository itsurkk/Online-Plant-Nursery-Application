package com.sprint.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sprint.entities.Customer;
import com.sprint.service.ICustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService customerService;

	// ADD CUSTOMER AND RETURNS RESPONSE ENTITY
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Customer> addCustomer(@Valid @RequestBody Customer customer) {
		Customer cust = customerService.addCustomer(customer);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(cust.getCustomerId()).toUri();
		return ResponseEntity.created(location).body(cust);
	}

	// UPDATE CUSTOMER AND RETURNS RESPONSE ENTITY
	@PutMapping("/update/{id}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		Customer cust = customerService.updateCustomer(customer);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(cust.getCustomerId()).toUri();
		return ResponseEntity.created(location).body(cust);
	}

	// DELETE CUSTOMER AND RETURNS RESPONSE ENTITY
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteCustomer(@RequestBody Customer customer) {
		Customer cust = customerService.deleteCustomer(customer);
		if (cust == null) {
			return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Problem in deleting", HttpStatus.BAD_REQUEST);
		}
	}

	// VIEW ALL CUSTOMER
	@GetMapping("/customers")
	public List<Customer> viewAllCustomer() {
		return customerService.viewAllCustomers();
	}

	// VIEW CUSTOMER BY ID AND RETURNS RESPONSE ENTITY
	@GetMapping("/find/{custid}")
	public ResponseEntity<Customer> viewCustomer(@PathVariable("custid") int customerId) {
		Customer cust = customerService.viewCustomer(customerId);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(cust.getCustomerId()).toUri();
		return ResponseEntity.created(location).body(cust);
	}

}
