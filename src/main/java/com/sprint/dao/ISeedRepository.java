package com.sprint.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint.entities.Seed;


@Repository
public interface ISeedRepository extends JpaRepository<Seed, Integer> {
	Seed findBycommonname(String commonName);

	List<Seed> findAllBytypeOfSeeds(String typeOfSeed);
}
