package com.sinha.tutorial.builderDP.BeverageExample;

/**
 * 
 * @author kishore
 *
 */
public class TeaBuilder extends BeverageBuilder {

	@Override
	void setBeverageType() {
		System.out.println("Building Tea......");
		getBeverage().setBeverageName("Tea");
	}

	@Override
	void setWater() {
		System.out.println("Step 1 : Boiling water");
		getBeverage().setWater(30);
	}

	@Override
	void setMilk() {
		System.out.println("Step 2 : Adding milk");
		getBeverage().setMilk(20);
	}

	@Override
	void setSugar() {
		System.out.println("Step 3 : Adding sugar");
		getBeverage().setSugar(10);
	}

	@Override
	void setPowderQuantity() {
		System.out.println("Step 4 : Adding 9 Grams of Tea Powder");
		getBeverage().setPowerQuantity(9);
	}

	@Override
	Beverage createBeverage() {
		return new Beverage();
	}

}
