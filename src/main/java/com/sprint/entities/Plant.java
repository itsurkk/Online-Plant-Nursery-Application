package com.sprint.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Entity
public class Plant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int plantId;

	@Min(value = 1, message = "Plant's Height can't be 0")
	private int plantHeight;

	@NotBlank(message = "Plant Spread can't be blank")
	private String plantSpread;

	@NotBlank(message = "Plant Name can't be blank")
	private String commonName;

	@NotBlank(message = "Plant's Bloom time can't be blank")
	private String bloomTime;

	@NotBlank(message = "Plant's Medicinal Use can't be blank")
	private String medicinalOrCulinaryUse;

	@NotBlank(message = "Plant's Difficulty Level  can't be blank")
	private String difficultyLevel;

	@NotBlank(message = "Plant's Temperature can't be blank")
	private String temperature;

	@NotBlank(message = "Type of plant can't be blank")
	private String typeOfPlant;

	@NotBlank(message = "Plant Description can't be blank")
	private String plantDescription;

	@Min(value = 0, message = "Plant's stock can't be negative")
	private int plantsStock;

	@Min(value = 1, message = "Plant's cost can't be 0")
	private double plantCost;

	public Plant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plant(int plantId, @Min(value = 1, message = "Plant's Height can't be 0") int plantHeight,
			@NotBlank(message = "Plant Spread can't be blank") String plantSpread,
			@NotBlank(message = "Plant Name can't be blank") String commonName,
			@NotBlank(message = "Plant's Bloom time can't be blank") String bloomTime,
			@NotBlank(message = "Plant's Medicinal Use can't be blank") String medicinalOrCulinaryUse,
			@NotBlank(message = "Plant's Difficulty Level  can't be blank") String difficultyLevel,
			@NotBlank(message = "Plant's Temperature can't be blank") String temperature,
			@NotBlank(message = "Type of plant can't be blank") String typeOfPlant,
			@NotBlank(message = "Plant Description can't be blank") String plantDescription,
			@Min(value = 0, message = "Plant's stock can't be negative") int plantsStock,
			@Min(value = 1, message = "Plant's cost can't be 0") double plantCost) {
		super();
		this.plantId = plantId;
		this.plantHeight = plantHeight;
		this.plantSpread = plantSpread;
		this.commonName = commonName;
		this.bloomTime = bloomTime;
		this.medicinalOrCulinaryUse = medicinalOrCulinaryUse;
		this.difficultyLevel = difficultyLevel;
		this.temperature = temperature;
		this.typeOfPlant = typeOfPlant;
		this.plantDescription = plantDescription;
		this.plantsStock = plantsStock;
		this.plantCost = plantCost;
	}

	public int getPlantId() {
		return plantId;
	}

	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}

	public int getPlantHeight() {
		return plantHeight;
	}

	public void setPlantHeight(int plantHeight) {
		this.plantHeight = plantHeight;
	}

	public String getPlantSpread() {
		return plantSpread;
	}

	public void setPlantSpread(String plantSpread) {
		this.plantSpread = plantSpread;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getBloomTime() {
		return bloomTime;
	}

	public void setBloomTime(String bloomTime) {
		this.bloomTime = bloomTime;
	}

	public String getMedicinalOrCulinaryUse() {
		return medicinalOrCulinaryUse;
	}

	public void setMedicinalOrCulinaryUse(String medicinalOrCulinaryUse) {
		this.medicinalOrCulinaryUse = medicinalOrCulinaryUse;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getTypeOfPlant() {
		return typeOfPlant;
	}

	public void setTypeOfPlant(String typeOfPlant) {
		this.typeOfPlant = typeOfPlant;
	}

	public String getPlantDescription() {
		return plantDescription;
	}

	public void setPlantDescription(String plantDescription) {
		this.plantDescription = plantDescription;
	}

	public int getPlantsStock() {
		return plantsStock;
	}

	public void setPlantsStock(int plantsStock) {
		this.plantsStock = plantsStock;
	}

	public double getPlantCost() {
		return plantCost;
	}

	public void setPlantCost(double plantCost) {
		this.plantCost = plantCost;
	}

	@Override
	public String toString() {
		return "Plant [plantId=" + plantId + ", plantHeight=" + plantHeight + ", plantSpread=" + plantSpread
				+ ", commonName=" + commonName + ", bloomTime=" + bloomTime + ", medicinalOrCulinaryUse="
				+ medicinalOrCulinaryUse + ", difficultyLevel=" + difficultyLevel + ", temperature=" + temperature
				+ ", typeOfPlant=" + typeOfPlant + ", plantDescription=" + plantDescription + ", plantsStock="
				+ plantsStock + ", plantCost=" + plantCost + "]";
	}
	
}
