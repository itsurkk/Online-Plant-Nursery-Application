package com.sprint.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.dao.ISeedRepository;
import com.sprint.entities.Seed;

@Service
public class ISeedServiceImpl implements ISeedService {

	@Autowired
	private ISeedRepository repository;

	// ADD SEED
	@Override
	public Seed addSeed(Seed seed) {
		return repository.save(seed);
	}

	// UPDATE SEED
	@Override
	public Seed updateSeed(Seed seed) {
		Seed s = repository.findById(seed.getSeedId())
				.orElseThrow(() -> new EntityNotFoundException("Currently No seeds are available with this id"));
		s.setTemperature(seed.getTemperature());
		return repository.save(s);
	}

	// DELETE SEED
	@Override
	public Seed deleteSeed(Seed seed) {
		repository.findById(seed.getSeedId())
				.orElseThrow(() -> new EntityNotFoundException("Currently No seeds are available with this id"));
		repository.delete(seed);
		return null;
	}

	// VIEW SEED BY ID
	@Override
	public Seed viewSeed(int seedId) {
		Seed s = repository.findById(seedId)
				.orElseThrow(() -> new EntityNotFoundException("Currently No seeds are available with this id"));
		return s;
	}

	// VIEW SEED BY COMMON NAME
	@Override
	public Seed viewSeed(String commonName) {
		Seed s = repository.findBycommonname(commonName);
		if (s == null) {
			throw new NullPointerException("Currently No seeds are available with this name");
		}
		return s;
	}

	// VIEW ALL SEEDS
	@Override
	public List<Seed> viewAllSeeds() {
		List<Seed> s = repository.findAll();
		if (s.isEmpty()) {
			throw new NullPointerException("Currently No Seeds are available..");
		}
		return s;
	}

	// VIEW ALL SEEDS BY TYPE
	@Override
	public List<Seed> viewAllSeeds(String typeOfSeed) {
		List<Seed> s = repository.findAllBytypeOfSeeds(typeOfSeed);
		if (s.isEmpty()) {
			throw new NullPointerException("Currently No seeds are available in this type");
		}
		return s;
	}

}
