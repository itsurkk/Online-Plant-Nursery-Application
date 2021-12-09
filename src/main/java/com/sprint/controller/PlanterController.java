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
import com.sprint.entities.Planter;
import com.sprint.service.IPlanterService;


@RestController
@RequestMapping(value = "/planters")
public class PlanterController {
	@Autowired
	private IPlanterService planterService;

	// GET-add planter
	@PostMapping("planters/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Planter> addPlanter(@Valid @RequestBody Planter planter) {
		Planter plant = planterService.addPlanter(planter);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}")
				.buildAndExpand(plant.getPlanterId()).toUri();
		return ResponseEntity.created(location).body(plant);
	}

	// PUT-update the planter
	@PutMapping("/planters/update/{id}")
	public ResponseEntity<Planter> updatePlanter(@RequestBody Planter planter) {
		Planter plant = planterService.updatePlanter(planter);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}")
				.buildAndExpand(plant.getPlanterId()).toUri();
		return ResponseEntity.created(location).body(plant);
	}

	// DELETE-delete the planter
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deletePlanter(@RequestBody Planter planter) {
		Planter plant = planterService.deletePlanter(planter);
		if (plant == null) {
			return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Problem in deleting", HttpStatus.BAD_REQUEST);
		}
	}

	// VIEW ALL PLANTERS
	@GetMapping("/planters")
	public List<Planter> viewAllPlanters() {
		return planterService.viewAllPlanters();
	}

	// VIEW ALL PLANTERS BY SHAPE
	@GetMapping("/planters/view/{plantshape}")
	public ResponseEntity<Planter> viewPlanter(@PathVariable("plantshape") String planterShape) {
		Planter plant = planterService.viewPlanter(planterShape);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}")
				.buildAndExpand(plant.getPlanterShape()).toUri();
		return ResponseEntity.created(location).body(plant);
	}

	// VIEW PLANTER BY ID
	@GetMapping("/planters/find/{plantid}")
	public ResponseEntity<Planter> viewPlanters(@PathVariable("plantid") int plantid) {
		Planter plant = planterService.viewPlanter(plantid);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}")
				.buildAndExpand(plant.getPlanterId()).toUri();
		return ResponseEntity.created(location).body(plant);
	}

	@GetMapping("/planters/find/range/{min}/{max}")
	public List<Planter> viewAllPlanters(@PathVariable("min") int minCost, @PathVariable("max") int maxCost) {
		return planterService.viewAllPlanters(minCost, maxCost);
	}
}