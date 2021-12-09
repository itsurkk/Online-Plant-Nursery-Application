package com.sprint.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint.entities.Plant;


@Repository
public interface IPlantRepository extends JpaRepository<Plant, Integer> {
	Optional<Plant> findByCommonName(String commonName);

	List<Plant> findAllByTypeOfPlant(String typeOfPlant);
}
