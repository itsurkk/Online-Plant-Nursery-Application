package com.sprint.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Entity
public class Planter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planterId;

	@Min(value = 1, message = "Planter's Height can't be 0")
	private float planterHeight;

	@Min(value = 1, message = "Planter's Capacity can't be 0")
	private int planterCapacity;

	@Min(value = 1, message = "Planter's Drinage Hole can't be 0")
	private int drinageHoles;

	@NotBlank(message = "Planter's color can't be blank")
	private String planterColor;

	@NotBlank(message = "Planter's shape can't be blank")
	private String planterShape;

	@Min(value = 0, message = "Planter's stock can't be negative")
	private int planterStock;

	@Min(value = 1, message = "Planter's cost can't be 0")
	private int planterCost;

	// PLANTERS MAPPED WITH PLANTS
	@OneToOne(cascade = CascadeType.ALL)
	private @Valid Plant plants;

	// PLANTERS MAPPED WITH SEEDS
	@OneToOne(cascade = CascadeType.ALL)
	private @Valid Seed seeds;

	public Planter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Planter(int planterId, @Min(value = 1, message = "Planter's Height can't be 0") float planterHeight,
			@Min(value = 1, message = "Planter's Capacity can't be 0") int planterCapacity,
			@Min(value = 1, message = "Planter's Drinage Hole can't be 0") int drinageHoles,
			@NotBlank(message = "Planter's color can't be blank") String planterColor,
			@NotBlank(message = "Planter's shape can't be blank") String planterShape,
			@Min(value = 0, message = "Planter's stock can't be negative") int planterStock,
			@Min(value = 1, message = "Planter's cost can't be 0") int planterCost, @Valid Plant plants,
			@Valid Seed seeds) {
		super();
		this.planterId = planterId;
		this.planterHeight = planterHeight;
		this.planterCapacity = planterCapacity;
		this.drinageHoles = drinageHoles;
		this.planterColor = planterColor;
		this.planterShape = planterShape;
		this.planterStock = planterStock;
		this.planterCost = planterCost;
		this.plants = plants;
		this.seeds = seeds;
	}

	public int getPlanterId() {
		return planterId;
	}

	public void setPlanterId(int planterId) {
		this.planterId = planterId;
	}

	public float getPlanterHeight() {
		return planterHeight;
	}

	public void setPlanterHeight(float planterHeight) {
		this.planterHeight = planterHeight;
	}

	public int getPlanterCapacity() {
		return planterCapacity;
	}

	public void setPlanterCapacity(int planterCapacity) {
		this.planterCapacity = planterCapacity;
	}

	public int getDrinageHoles() {
		return drinageHoles;
	}

	public void setDrinageHoles(int drinageHoles) {
		this.drinageHoles = drinageHoles;
	}

	public String getPlanterColor() {
		return planterColor;
	}

	public void setPlanterColor(String planterColor) {
		this.planterColor = planterColor;
	}

	public String getPlanterShape() {
		return planterShape;
	}

	public void setPlanterShape(String planterShape) {
		this.planterShape = planterShape;
	}

	public int getPlanterStock() {
		return planterStock;
	}

	public void setPlanterStock(int planterStock) {
		this.planterStock = planterStock;
	}

	public int getPlanterCost() {
		return planterCost;
	}

	public void setPlanterCost(int planterCost) {
		this.planterCost = planterCost;
	}

	public Plant getPlants() {
		return plants;
	}

	public void setPlants(Plant plants) {
		this.plants = plants;
	}

	public Seed getSeeds() {
		return seeds;
	}

	public void setSeeds(Seed seeds) {
		this.seeds = seeds;
	}

	@Override
	public String toString() {
		return "Planter [planterId=" + planterId + ", planterHeight=" + planterHeight + ", planterCapacity="
				+ planterCapacity + ", drinageHoles=" + drinageHoles + ", planterColor=" + planterColor
				+ ", planterShape=" + planterShape + ", planterStock=" + planterStock + ", planterCost=" + planterCost
				+ ", plants=" + plants + ", seeds=" + seeds + "]";
	}
	
}
