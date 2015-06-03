package com.sinha.tutorial.builderDP.BeverageExample;

/**
 * 
 * @author kishore
 *
 */
public class CoffeeBuilder extends BeverageBuilder {

	@Override
	void setBeverageType() {
		System.out.println("Building Coffee......");
		getBeverage().setBeverageName("Coffee");
	}

	@Override
	void setWater() {
		System.out.println("Step 1 : Boiling water");
		getBeverage().setWater(40);
	}

	@Override
	void setMilk() {
		System.out.println("Step 2 : Adding milk");
		getBeverage().setMilk(50);
	}

	@Override
	void setSugar() {
		System.out.println("Step 3 : Adding sugar");
		getBeverage().setSugar(10);
	}

	@Override
	void setPowderQuantity() {
		System.out.println("Step 4 : Adding 9 Grams of Coffee powder");
		getBeverage().setPowerQuantity(9);
	}

	@Override
	Beverage createBeverage() {
		return new Beverage();
	}

}
