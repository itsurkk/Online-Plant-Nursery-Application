package com.sprint.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sprint.entities.Seed;
import com.sprint.service.ISeedService;


@RestController
@RequestMapping("/seed")
public class SeedController {

	@Autowired
	private ISeedService seedService;

	// ADD SEED
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Seed> addSeed(@Valid @RequestBody Seed seed) {
		Seed s = seedService.addSeed(seed);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(s.getSeedId())
				.toUri();
		return ResponseEntity.created(location).body(s);
	}

	// UPDATE SEED
	@PutMapping("/update/{id}")
	public ResponseEntity<Seed> updateSeed(@RequestBody Seed seed) {
		Seed s = seedService.updateSeed(seed);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(s.getSeedId())
				.toUri();
		return ResponseEntity.created(location).body(s);
	}

	// DELETE SEED
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteSeed(@RequestBody Seed seed) {
		Seed s = seedService.deleteSeed(seed);
		if (s == null) {
			return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Problem in deleting", HttpStatus.BAD_REQUEST);
		}
	}

	// VIEW ALL SEEDS
	@GetMapping("/seeds")
	public List<Seed> viewAllSeeds() {
		return seedService.viewAllSeeds();
	}

	// VIEW SEEDS BY TYPE
	@GetMapping("/seeds/{seedtype}")
	public List<Seed> viewAllSeedsByType(@PathVariable("seedtype") String typeOfSeed) {
		return seedService.viewAllSeeds(typeOfSeed);
	}

	// VIEW SEED BY ID
	@GetMapping("/find/{seedid}")
	public ResponseEntity<Seed> viewSeed(@PathVariable("seedid") int seedId) {
		Seed s = seedService.viewSeed(seedId);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(s.getSeedId())
				.toUri();
		return ResponseEntity.created(location).body(s);
	}

	// VIEW SEED BY NAME
	@GetMapping("/seed/name/{seedname}")
	public ResponseEntity<Seed> viewSeedByName(@PathVariable("seedname") String commonName) {
		Seed s = seedService.viewSeed(commonName);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(s.getSeedId())
				.toUri();
		return ResponseEntity.created(location).body(s);
	}
}
