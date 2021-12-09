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

import com.sprint.dao.ISeedRepository;
import com.sprint.entities.Seed;
import com.sprint.service.ISeedServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ISeedServiceTest {
	@Mock
	private ISeedRepository repository;
	@InjectMocks
	private ISeedServiceImpl seedService;

	// TEST TO ADD SEED
	@Test
	public void saveSeedTest() {
		Seed seed = new Seed(1, "Rose", "morning", "yes", "easy", "room temperature", "hybrid", "good seeds", 5, 20,
				10);
		when(repository.save(seed)).thenReturn(seed);
		assertEquals(seed, seedService.addSeed(seed));
	}

	// TEST TO DELETE SEED BY ID
	@Test
	public void deleteSeedTest() {
		repository.deleteById(1);
		assertThat(repository.existsById(1)).isFalse();
	}

	// TEST TO VIEW SEED BY ID
	@Test
	public void viewBySeedByIdTest() {
		int seedid = 1;
		when(repository.findById(seedid)).thenReturn(Optional.of(new Seed(1, "Rose", "morning", "daily", "easy",
				"room temperature", "hybrid", "good seeds", 5, 20, 10)));
		assertEquals("Rose", seedService.viewSeed(seedid).getCommonname());
	}

	// TEST TO VIEW ALL SEEDS
	@Test
	public void viewAllSeedsTest() {
		when(repository.findAll()).thenReturn(Stream.of(
				new Seed(1, "Rose", "morning", "yes", "easy", "room temperature", "hybrid", "good seeds", 5, 20, 10),
				new Seed(1, "Rose", "morning", "yes", "easy", "room temperature", "rose", "good seeds", 5, 20, 10))
				.collect(Collectors.toList()));
		assertEquals(2, seedService.viewAllSeeds().size());
	}

	// TEST TO VIEW SEEDS BY COMMON NAME
	@Test
	public void viewSeedByCommonNameTest() {
		String commonName = "rose";
		when(repository.findBycommonname(commonName)).thenReturn(
				new Seed(1, "Rose", "morning", "daily", "easy", "room temperature", "hybrid", "good seeds", 5, 20, 10));
		assertEquals("Rose", seedService.viewSeed(commonName).getCommonname());

	}

	// TEST TO VIEW SEEDS BY TYPE
	@Test
	public void viewAllByTypeOfSeedTest() {
		when(repository.findAll()).thenReturn(Stream.of(
				new Seed(1, "Rose", "morning", "yes", "easy", "room temperature", "hybrid", "good seeds", 5, 20, 10),
				new Seed(1, "Rose", "morning", "yes", "easy", "room temperature", "rose", "good seeds", 5, 20, 10))
				.collect(Collectors.toList()));
		assertEquals(2, seedService.viewAllSeeds().size());
	}
}
