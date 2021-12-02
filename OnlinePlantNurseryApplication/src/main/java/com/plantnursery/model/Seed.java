package com.plantnursery.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seed
{
	@Id
	private Integer seedId;
	private String commonName;
	private String bloomTime;
	private String watering;
	private String difficultyLevel;
	private String temparature;
	private String typeOfSeeds;
	private String seedsDescription;
	private Integer seedsStock;
	private double seedsCost;
	private Integer seedsPerPacket;
	public Seed() {
		super();
	}
	public Seed(Integer seedId, String commonName, String bloomTime, String watering, String difficultyLevel,
			String temparature, String typeOfSeeds, String seedsDescription, Integer seedsStock, double seedsCost,
			Integer seedsPerPacket) {
		super();
		this.seedId = seedId;
		this.commonName = commonName;
		this.bloomTime = bloomTime;
		this.watering = watering;
		this.difficultyLevel = difficultyLevel;
		this.temparature = temparature;
		this.typeOfSeeds = typeOfSeeds;
		this.seedsDescription = seedsDescription;
		this.seedsStock = seedsStock;
		this.seedsCost = seedsCost;
		this.seedsPerPacket = seedsPerPacket;
	}
	/**
	 * @return the seedId
	 */
	public Integer getSeedId() {
		return seedId;
	}
	/**
	 * @param seedId the seedId to set
	 */
	public void setSeedId(Integer seedId) {
		this.seedId = seedId;
	}
	/**
	 * @return the commonName
	 */
	public String getCommonName() {
		return commonName;
	}
	/**
	 * @param commonName the commonName to set
	 */
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	/**
	 * @return the bloomTime
	 */
	public String getBloomTime() {
		return bloomTime;
	}
	/**
	 * @param bloomTime the bloomTime to set
	 */
	public void setBloomTime(String bloomTime) {
		this.bloomTime = bloomTime;
	}
	/**
	 * @return the watering
	 */
	public String getWatering() {
		return watering;
	}
	/**
	 * @param watering the watering to set
	 */
	public void setWatering(String watering) {
		this.watering = watering;
	}
	/**
	 * @return the difficultyLevel
	 */
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	/**
	 * @param difficultyLevel the difficultyLevel to set
	 */
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	/**
	 * @return the temparature
	 */
	public String getTemparature() {
		return temparature;
	}
	/**
	 * @param temparature the temparature to set
	 */
	public void setTemparature(String temparature) {
		this.temparature = temparature;
	}
	/**
	 * @return the typeOfSeeds
	 */
	public String getTypeOfSeeds() {
		return typeOfSeeds;
	}
	/**
	 * @param typeOfSeeds the typeOfSeeds to set
	 */
	public void setTypeOfSeeds(String typeOfSeeds) {
		this.typeOfSeeds = typeOfSeeds;
	}
	/**
	 * @return the seedsDescription
	 */
	public String getSeedsDescription() {
		return seedsDescription;
	}
	/**
	 * @param seedsDescription the seedsDescription to set
	 */
	public void setSeedsDescription(String seedsDescription) {
		this.seedsDescription = seedsDescription;
	}
	/**
	 * @return the seedsStock
	 */
	public Integer getSeedsStock() {
		return seedsStock;
	}
	/**
	 * @param seedsStock the seedsStock to set
	 */
	public void setSeedsStock(Integer seedsStock) {
		this.seedsStock = seedsStock;
	}
	/**
	 * @return the seedsCost
	 */
	public double getSeedsCost() {
		return seedsCost;
	}
	/**
	 * @param seedsCost the seedsCost to set
	 */
	public void setSeedsCost(double seedsCost) {
		this.seedsCost = seedsCost;
	}
	/**
	 * @return the seedsPerPacket
	 */
	public Integer getSeedsPerPacket() {
		return seedsPerPacket;
	}
	/**
	 * @param seedsPerPacket the seedsPerPacket to set
	 */
	public void setSeedsPerPacket(Integer seedsPerPacket) {
		this.seedsPerPacket = seedsPerPacket;
	}
	@Override
	public String toString() {
		return "Seed [seedId=" + seedId + ", commonName=" + commonName + ", bloomTime=" + bloomTime + ", watering="
				+ watering + ", difficultyLevel=" + difficultyLevel + ", temparature=" + temparature + ", typeOfSeeds="
				+ typeOfSeeds + ", seedsDescription=" + seedsDescription + ", seedsStock=" + seedsStock + ", seedsCost="
				+ seedsCost + ", seedsPerPacket=" + seedsPerPacket + "]";
	}
	
}
