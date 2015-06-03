package com.sinha.tutorial.builderDP.BeverageExample;

/**
 * 
 * @author kishore
 *
 */
public abstract class BeverageBuilder {

	private Beverage beverage;

	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public final Beverage buildBeverage() {
	
		Beverage beverageLocal = createBeverage();
		setBeverage(beverageLocal);
		setBeverageType();
		setWater();
		setMilk();
		setSugar();
		setPowderQuantity();
		return beverageLocal;
	}
	
	abstract void setBeverageType();
	abstract void setWater();
	abstract void setMilk();
	abstract void setSugar();
	abstract void setPowderQuantity();
	abstract Beverage createBeverage();
}
