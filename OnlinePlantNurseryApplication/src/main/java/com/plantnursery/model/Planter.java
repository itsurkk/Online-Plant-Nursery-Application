package com.plantnursery.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Planter 
{
	@Id
	private Integer planterId;
	private float planterHeight;
	private int planterCapacity;
	private int drinageHoles;
	private int planterColor;
	private String planterShape;
	private int planterStock;
	private int planterCost;
	private Plant plants;
	private Seed seeds;
	public Planter() {
		super();
	}
	public Planter(Integer planterId, float planterHeight, int planterCapacity, int drinageHoles, int planterColor,
			String planterShape, int planterStock, int planterCost, Plant plants, Seed seeds) {
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
	/**
	 * @return the planterId
	 */
	public Integer getPlanterId() {
		return planterId;
	}
	/**
	 * @param planterId the planterId to set
	 */
	public void setPlanterId(Integer planterId) {
		this.planterId = planterId;
	}
	/**
	 * @return the planterHeight
	 */
	public float getPlanterHeight() {
		return planterHeight;
	}
	/**
	 * @param planterHeight the planterHeight to set
	 */
	public void setPlanterHeight(float planterHeight) {
		this.planterHeight = planterHeight;
	}
	/**
	 * @return the planterCapacity
	 */
	public int getPlanterCapacity() {
		return planterCapacity;
	}
	/**
	 * @param planterCapacity the planterCapacity to set
	 */
	public void setPlanterCapacity(int planterCapacity) {
		this.planterCapacity = planterCapacity;
	}
	/**
	 * @return the drinageHoles
	 */
	public int getDrinageHoles() {
		return drinageHoles;
	}
	/**
	 * @param drinageHoles the drinageHoles to set
	 */
	public void setDrinageHoles(int drinageHoles) {
		this.drinageHoles = drinageHoles;
	}
	/**
	 * @return the planterColor
	 */
	public int getPlanterColor() {
		return planterColor;
	}
	/**
	 * @param planterColor the planterColor to set
	 */
	public void setPlanterColor(int planterColor) {
		this.planterColor = planterColor;
	}
	/**
	 * @return the planterShape
	 */
	public String getPlanterShape() {
		return planterShape;
	}
	/**
	 * @param planterShape the planterShape to set
	 */
	public void setPlanterShape(String planterShape) {
		this.planterShape = planterShape;
	}
	/**
	 * @return the planterStock
	 */
	public int getPlanterStock() {
		return planterStock;
	}
	/**
	 * @param planterStock the planterStock to set
	 */
	public void setPlanterStock(int planterStock) {
		this.planterStock = planterStock;
	}
	/**
	 * @return the planterCost
	 */
	public int getPlanterCost() {
		return planterCost;
	}
	/**
	 * @param planterCost the planterCost to set
	 */
	public void setPlanterCost(int planterCost) {
		this.planterCost = planterCost;
	}
	/**
	 * @return the plants
	 */
	public Plant getPlants() {
		return plants;
	}
	/**
	 * @param plants the plants to set
	 */
	public void setPlants(Plant plants) {
		this.plants = plants;
	}
	/**
	 * @return the seeds
	 */
	public Seed getSeeds() {
		return seeds;
	}
	/**
	 * @param seeds the seeds to set
	 */
	public void setSeeds(Seed seeds) {
		this.seeds = seeds;
	}
	@Override
	public String toString() {
		return "Planter [planterId=" + planterId + ", planterHeight=" + planterHeight + ", planterCapacity="
				+ planterCapacity + ", drinageHoles=" + drinageHoles + ", planterColor=" + planterColor
				+ ", planterShape=" + planterShape + ", planterStock=" + planterStock + ", planterCost=" + planterCost
				+ ", plants=" + plants + "]";
	}
	
}
