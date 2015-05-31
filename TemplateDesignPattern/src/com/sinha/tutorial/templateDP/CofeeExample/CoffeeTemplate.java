package com.sinha.tutorial.templateDP.CofeeExample;

public abstract class CoffeeTemplate {

	public final void prepareCofee() {
		
		boilWater();
		addMilk();
		addSugar();
		addCofeePowder();
		System.out.println("Hot Cofee is Ready !!!");
	}
	
	public abstract void boilWater();
	public abstract void addMilk();
	public abstract void addSugar();
	public abstract void addCofeePowder();
}
