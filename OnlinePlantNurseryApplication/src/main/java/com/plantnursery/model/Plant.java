package com.plantnursery.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plant
{
	@Id
	private Integer plantId;
	private Integer plantHeight;
	private String plantSpread;
	private String commonName;
	private String bloomType;
	private String medicalOrCulinaryUse;
	private String difficultyLevel;
	private String temperature;
	private String typeOfPlant;
	private String plantDescription;
	private Integer plantsStock;
	private double plantCost;
	public Plant() {
		super();
	}
	public Plant(Integer plantId, Integer plantHeight, String plantSpread, String commonName, String bloomType,
			String medicalOrCulinaryUse, String difficultyLevel, String temperature, String typeOfPlant,
			String plantDescription, Integer plantsStock, double plantCost) {
		super();
		this.plantId = plantId;
		this.plantHeight = plantHeight;
		this.plantSpread = plantSpread;
		this.commonName = commonName;
		this.bloomType = bloomType;
		this.medicalOrCulinaryUse = medicalOrCulinaryUse;
		this.difficultyLevel = difficultyLevel;
		this.temperature = temperature;
		this.typeOfPlant = typeOfPlant;
		this.plantDescription = plantDescription;
		this.plantsStock = plantsStock;
		this.plantCost = plantCost;
	}
	/**
	 * @return the plantId
	 */
	public Integer getPlantId() {
		return plantId;
	}
	/**
	 * @param plantId the plantId to set
	 */
	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}
	/**
	 * @return the plantHeight
	 */
	public Integer getPlantHeight() {
		return plantHeight;
	}
	/**
	 * @param plantHeight the plantHeight to set
	 */
	public void setPlantHeight(Integer plantHeight) {
		this.plantHeight = plantHeight;
	}
	/**
	 * @return the plantSpread
	 */
	public String getPlantSpread() {
		return plantSpread;
	}
	/**
	 * @param plantSpread the plantSpread to set
	 */
	public void setPlantSpread(String plantSpread) {
		this.plantSpread = plantSpread;
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
	 * @return the bloomType
	 */
	public String getBloomType() {
		return bloomType;
	}
	/**
	 * @param bloomType the bloomType to set
	 */
	public void setBloomType(String bloomType) {
		this.bloomType = bloomType;
	}
	/**
	 * @return the medicalOrCulinaryUse
	 */
	public String getMedicalOrCulinaryUse() {
		return medicalOrCulinaryUse;
	}
	/**
	 * @param medicalOrCulinaryUse the medicalOrCulinaryUse to set
	 */
	public void setMedicalOrCulinaryUse(String medicalOrCulinaryUse) {
		this.medicalOrCulinaryUse = medicalOrCulinaryUse;
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
	 * @return the temperature
	 */
	public String getTemperature() {
		return temperature;
	}
	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	/**
	 * @return the typeOfPlant
	 */
	public String getTypeOfPlant() {
		return typeOfPlant;
	}
	/**
	 * @param typeOfPlant the typeOfPlant to set
	 */
	public void setTypeOfPlant(String typeOfPlant) {
		this.typeOfPlant = typeOfPlant;
	}
	/**
	 * @return the plantDescription
	 */
	public String getPlantDescription() {
		return plantDescription;
	}
	/**
	 * @param plantDescription the plantDescription to set
	 */
	public void setPlantDescription(String plantDescription) {
		this.plantDescription = plantDescription;
	}
	/**
	 * @return the plantsStock
	 */
	public Integer getPlantsStock() {
		return plantsStock;
	}
	/**
	 * @param plantsStock the plantsStock to set
	 */
	public void setPlantsStock(Integer plantsStock) {
		this.plantsStock = plantsStock;
	}
	/**
	 * @return the plantCost
	 */
	public double getPlantCost() {
		return plantCost;
	}
	/**
	 * @param plantCost the plantCost to set
	 */
	public void setPlantCost(double plantCost) {
		this.plantCost = plantCost;
	}
	@Override
	public String toString() {
		return "Plant [plantId=" + plantId + ", plantHeight=" + plantHeight + ", plantSpread=" + plantSpread
				+ ", commonName=" + commonName + ", bloomType=" + bloomType + ", medicalOrCulinaryUse="
				+ medicalOrCulinaryUse + ", difficultyLevel=" + difficultyLevel + ", temperature=" + temperature
				+ ", typeOfPlant=" + typeOfPlant + ", plantDescription=" + plantDescription + ", plantsStock="
				+ plantsStock + ", plantCost=" + plantCost + "]";
	}
	
	
}
