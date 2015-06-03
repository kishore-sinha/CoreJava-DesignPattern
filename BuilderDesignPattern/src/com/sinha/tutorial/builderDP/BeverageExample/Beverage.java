package com.sinha.tutorial.builderDP.BeverageExample;

/**
 * 
 * @author kishore
 *
 */
public class Beverage {

	private int water;
	private int milk;
	private int sugar;
	private int powerQuantity;
	private String beverageName;
	
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getMilk() {
		return milk;
	}
	public void setMilk(int milk) {
		this.milk = milk;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public int getPowerQuantity() {
		return powerQuantity;
	}
	public void setPowerQuantity(int powerQuantity) {
		this.powerQuantity = powerQuantity;
	}
	public String getBeverageName() {
		return beverageName;
	}
	public void setBeverageName(String beverageName) {
		this.beverageName = beverageName;
	}
	
	@Override
	public String toString() {
		return "Beverage [water=" + water + ", milk=" + milk + ", sugar="
				+ sugar + ", powerQuantity=" + powerQuantity
				+ ", beverageName=" + beverageName + "]";
	}
}
