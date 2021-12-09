package com.sprint.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.dao.IPlanterRepository;
import com.sprint.entities.Planter;

@Service
public class IPlanterServiceImpl implements IPlanterService {
	@Autowired
	private IPlanterRepository repository;

	@Override
	// adds planter
	public Planter addPlanter(Planter planter) {
		return repository.save(planter);
	}

	// update the planter
	@Override
	public Planter updatePlanter(Planter planter) {
		Planter p = repository.findById(planter.getPlanterId())
				.orElseThrow(() -> new EntityNotFoundException("Currently no planter available with this id"));
		p.setPlanterCost(planter.getPlanterCost());
		return repository.save(p);
	}

	// delete the planter by id
	@Override
	public Planter deletePlanter(Planter planter) {
		repository.findById(planter.getPlanterId())
				.orElseThrow(() -> new EntityNotFoundException("Currently no planter available with this id"));
		repository.delete(planter);
		return null;
	}

	// view planter by id
	@Override
	public Planter viewPlanter(int planterId) {
		Planter p = repository.findById(planterId)
				.orElseThrow(() -> new EntityNotFoundException("Currently no planter available with this id"));
		return p;
	}

	// view planter by shape
	@Override
	public Planter viewPlanter(String planterShape) {
		Planter p = repository.findByplanterShape(planterShape);
		if (p == null) {
			throw new NullPointerException("Currently no planter available within this shape");
		}
		return p;
	}

	// view all planters
	@Override
	public List<Planter> viewAllPlanters() {
		List<Planter> p = repository.findAll();
		if (p.isEmpty()) {
			throw new NullPointerException("Currently no planter available in the list");
		} else
			return p;
	}

	@Override
	public List<Planter> viewAllPlanters(int minCost, int maxCost) {
		List<Planter> p = repository.findAllByplanterCostBetween(minCost, maxCost);
		if (p.isEmpty()) {
			throw new NullPointerException("Currently no planter available within this range");
		}
		return p;
	}
}
