package com.sprint.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint.entities.Planter;

@Repository
public interface IPlanterRepository extends JpaRepository<Planter, Integer> {
	Planter findByplanterShape(String planterShape);

	List<Planter> findAllByplanterCostBetween(int minCost, int maxCost);
}
