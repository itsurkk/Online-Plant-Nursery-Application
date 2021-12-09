package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sprint.dao.IOrderRepository;
import com.sprint.entities.Orders;
import com.sprint.service.IOrderServiceImpl;

@ExtendWith(MockitoExtension.class)
public class IOrderServiceTest {
	@Mock
	private IOrderRepository repository;
	@InjectMocks
	private IOrderServiceImpl OrdersService;

	// TO SAVE ORDERS
	@Test
	public void saveOrdersTest() {
		Orders plan = new Orders(1, LocalDate.now(), "online", 20, 200.00, null);
		when(repository.save(plan)).thenReturn(plan);
		assertEquals(plan, OrdersService.addOrder(plan));
	}

	// TO DELETE ORDERS
	@Test
	public void testDelete() {
		repository.deleteById(1);
		assertThat(repository.existsById(1)).isFalse();
	}

	// TO VIEW ALL ORDERS
	@Test
	public void viewAllOrdersTest() {
		when(repository.findAll())
				.thenReturn(Stream
						.of(new Orders(1, LocalDate.now(), "online", 20, 200.00, null),
								new Orders(2, LocalDate.now(), "online", 22, 250.00, null))
						.collect(Collectors.toList()));
		assertEquals(2, OrdersService.viewAllOrders().size());

	}

}
