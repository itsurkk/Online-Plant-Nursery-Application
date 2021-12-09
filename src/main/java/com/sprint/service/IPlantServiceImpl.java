package com.sprint.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.dao.IPlantRepository;
import com.sprint.entities.Plant;


@Service
public class IPlantServiceImpl implements IPlantService {

	@Autowired
	private IPlantRepository repository;

	@Override
	public Plant addPlant(Plant plant) {
		return repository.save(plant);
	}

	@Override
	public Plant updatePlant(Plant plant) {
		Plant p = repository.findById(plant.getPlantId())
				.orElseThrow(() -> new EntityNotFoundException("Currently No Plant Available with this id"));
		p.setTypeOfPlant(plant.getTypeOfPlant());
		return repository.save(p);
	}

	@Override
	public Plant deletePlant(Plant plant) {
		repository.findById(plant.getPlantId())
				.orElseThrow(() -> new EntityNotFoundException("Currently No Plant Available with this id"));
		repository.delete(plant);
		return null;
	}

	@Override
	public Plant viewPlant(int plantId) {
		Plant p = repository.findById(plantId)
				.orElseThrow(() -> new EntityNotFoundException("Currently No Plant Available with this id"));
		return p;
	}

	@Override
	public Plant viewPlant(String commonName) {
		Plant p = repository.findByCommonName(commonName)
				.orElseThrow(() -> new EntityNotFoundException("Currently No Plant Available with this name"));
		return p;
	}

	@Override
	public List<Plant> viewAllPlants() {
		List<Plant> p = repository.findAll();
		if (p.isEmpty()) {
			throw new NullPointerException("Currently No Plant Available in the list");
		} else
			return p;
	}

	@Override
	public List<Plant> viewAllPlants(String typeOfPlant) {
		List<Plant> p = repository.findAllByTypeOfPlant(typeOfPlant);

		if (p.isEmpty()) {
			throw new NullPointerException("Currently No Plant Available in the list");
		} else
			return p;
	}
}
