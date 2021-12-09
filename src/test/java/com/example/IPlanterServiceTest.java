package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sprint.dao.IPlanterRepository;
import com.sprint.entities.Planter;
import com.sprint.service.IPlanterServiceImpl;

@ExtendWith(MockitoExtension.class)
public class IPlanterServiceTest {

	@Mock
	IPlanterRepository repository;
	@InjectMocks
	IPlanterServiceImpl service;

	// TO ADD PLANTER
	@Test
	public void addPlanter() {
		Planter planter = new Planter(1, 1, 1, 1, "Black", "round", 10, 10, null, null);
		when(repository.save(planter)).thenReturn(planter);
		assertEquals(planter, service.addPlanter(planter));
	}

	// TO DELETE PLANTER
	@Test
	public void deletePlanter() {
		repository.deleteById(1);
		assertThat(repository.existsById(1)).isFalse();
	}

	// TO VIEW ALL PLANTER
	@Test
	public void viewAllPlanter() {
		when(repository.findAll())
				.thenReturn(Stream
						.of(new Planter(1, 1, 1, 1, "Black", "round", 10, 10, null, null),
								new Planter(1, 1, 1, 1, "Black", "round", 10, 10, null, null))
						.collect(Collectors.toList()));
		assertEquals(2, service.viewAllPlanters().size());
	}

	// TO VIEW PLANTS WITHIN GIVEN RANGE
	@Test
	public void viewAllPlanterByRange() {
		when(repository.findAllByplanterCostBetween(10, 20))
				.thenReturn(Stream
						.of(new Planter(1, 1, 1, 1, "Black", "round", 10, 10, null, null),
								new Planter(2, 1, 1, 1, "Black", "round", 10, 20, null, null))
						.collect(Collectors.toList()));
		assertEquals(2, service.viewAllPlanters(10, 20).size());
	}

	// TO VIEW PLANTS BY SHAPE
	@Test
	public void viewAllPlanterByShape() {
		when(repository.findByplanterShape("round"))
				.thenReturn((new Planter(1, 1, 1, 1, "Black", "square", 10, 10, null, null)));
		assertNotEquals("round", service.viewPlanter("round").getPlanterShape());
	}

	@Test
	public void viewPlanterById() {
		Planter planter = new Planter(1, 1, 1, 1, "Black", "square", 10, 10, null, null);
		when(repository.findById(1)).thenReturn(Optional.of(planter));
		assertEquals(planter, service.viewPlanter(1));
	}

//	@Test
//	public void updatePlanter() {
//		Planter planter = new Planter(1, 1, 1, 1, "Black", "square", 10, 10, null, null);
//		planter.setPlanterCost(99);
//		when(repository.findById(1)).thenReturn(Optional.of(planter));
//		assertEquals(planter, service.updatePlanter(planter));
//	}
}
