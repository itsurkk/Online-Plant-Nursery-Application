package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sprint.dao.ICustomerRepository;
import com.sprint.entities.Address;
import com.sprint.entities.Customer;
import com.sprint.service.ICustomerServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ICustomerServiceTest {
	@Mock
	private ICustomerRepository repository;
	@InjectMocks
	private ICustomerServiceImpl customerService;

	// TO ADD CUSTOMER
	@Test
	public void addCustomerTest() {
		Address add = new Address(1, "34", "abc colony", "chennai", "tamilnadu", 625005);
		Customer cust = new Customer(1, "John", "john12@gmail.com", "JOHN", "john123", add);
		when(repository.save(cust)).thenReturn(cust);
		assertEquals(cust, customerService.addCustomer(cust));
	}

	// TO VIEW CUSTOMER BY ID
	@Test
	public void viewByCustomerByIdTest() {
		Address add = new Address(1, "34", "abc colony", "chennai", "tamilnadu", 625005);
		int customerId = 1;
		when(repository.findById(customerId))
				.thenReturn(Optional.of(new Customer(1, "John", "john12@gmail.com", "JOHN", "john123", add)));
		assertEquals("John", customerService.viewCustomer(customerId).getCustomerName());

	}

	// TO DELETE CUSTOMER
	@Test
	public void deleteCustomerTest() {
		repository.deleteById(1);
		assertThat(repository.existsById(1)).isFalse();
	}

	// TO VIEW ALL CUSTOMER
	@Test
	public void viewAllCustomerTest() {
		Address add = new Address(1, "34", "abc colony", "chennai", "tamilnadu", 625005);
		when(repository.findAll()).thenReturn(Stream
				.of(new Customer(1, "John", "john12@gmail.com", "JOHN", "john123", add),
						new Customer(1, "Jake", "jake12@gmail.com", "JOHN", "john123", add))
				.collect(Collectors.toList()));
		assertEquals(2, customerService.viewAllCustomers().size());

	}

}
