package com.sprint.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Seed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seedId;

	@NotBlank(message = "Seed's name can't be blank")
	private String commonname;

	@NotBlank(message = "Seed's bloom time can't be blank")
	private String bloomTime;

	@NotBlank(message = "Seed's watering can't be blank")
	private String watering;

	@NotBlank(message = "Seed's difficulty level can't be blank")
	private String difficultyLevel;

	@NotBlank(message = "Seed's temperature can't be blank")
	private String temperature;

	@NotBlank(message = "Seed's type can't be blank")
	private String typeOfSeeds;

	@NotBlank(message = "Seed's description can't be blank")
	private String seedsDescription;

	@Min(value = 0, message = "Seed's stock can't be negative")
	private int seedsStock;

	@Min(value = 1, message = "Seed's cost can't be 0")
	private double seedsCost;

	@Min(value = 1, message = "Seed's per packet can't be 0")
	private int seedsPerPacket;

	public Seed() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seed(int seedId, @NotBlank(message = "Seed's name can't be blank") String commonname,
			@NotBlank(message = "Seed's bloom time can't be blank") String bloomTime,
			@NotBlank(message = "Seed's watering can't be blank") String watering,
			@NotBlank(message = "Seed's difficulty level can't be blank") String difficultyLevel,
			@NotBlank(message = "Seed's temperature can't be blank") String temperature,
			@NotBlank(message = "Seed's type can't be blank") String typeOfSeeds,
			@NotBlank(message = "Seed's description can't be blank") String seedsDescription,
			@Min(value = 0, message = "Seed's stock can't be negative") int seedsStock,
			@Min(value = 1, message = "Seed's cost can't be 0") double seedsCost,
			@Min(value = 1, message = "Seed's per packet can't be 0") int seedsPerPacket) {
		super();
		this.seedId = seedId;
		this.commonname = commonname;
		this.bloomTime = bloomTime;
		this.watering = watering;
		this.difficultyLevel = difficultyLevel;
		this.temperature = temperature;
		this.typeOfSeeds = typeOfSeeds;
		this.seedsDescription = seedsDescription;
		this.seedsStock = seedsStock;
		this.seedsCost = seedsCost;
		this.seedsPerPacket = seedsPerPacket;
		
	}

	public int getSeedId() {
		return seedId;
	}

	public void setSeedId(int seedId) {
		this.seedId = seedId;
	}

	public String getCommonname() {
		return commonname;
	}

	public void setCommonname(String commonname) {
		this.commonname = commonname;
	}

	public String getBloomTime() {
		return bloomTime;
	}

	public void setBloomTime(String bloomTime) {
		this.bloomTime = bloomTime;
	}

	public String getWatering() {
		return watering;
	}

	public void setWatering(String watering) {
		this.watering = watering;
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

	public String getTypeOfSeeds() {
		return typeOfSeeds;
	}

	public void setTypeOfSeeds(String typeOfSeeds) {
		this.typeOfSeeds = typeOfSeeds;
	}

	public String getSeedsDescription() {
		return seedsDescription;
	}

	public void setSeedsDescription(String seedsDescription) {
		this.seedsDescription = seedsDescription;
	}

	public int getSeedsStock() {
		return seedsStock;
	}

	public void setSeedsStock(int seedsStock) {
		this.seedsStock = seedsStock;
	}

	public double getSeedsCost() {
		return seedsCost;
	}

	public void setSeedsCost(double seedsCost) {
		this.seedsCost = seedsCost;
	}

	public int getSeedsPerPacket() {
		return seedsPerPacket;
	}

	public void setSeedsPerPacket(int seedsPerPacket) {
		this.seedsPerPacket = seedsPerPacket;
	}

	@Override
	public String toString() {
		return "Seed [seedId=" + seedId + ", commonname=" + commonname + ", bloomTime=" + bloomTime + ", watering="
				+ watering + ", difficultyLevel=" + difficultyLevel + ", temperature=" + temperature + ", typeOfSeeds="
				+ typeOfSeeds + ", seedsDescription=" + seedsDescription + ", seedsStock=" + seedsStock + ", seedsCost="
				+ seedsCost + ", seedsPerPacket=" + seedsPerPacket + "]";
	}
	
}
