package com.sinha.tutorial.decoratorDP.CarExample;

public class SportsCar extends CarDecorator {

	public SportsCar(Car newCar) {
		super(newCar);
	}
	
	public void assemble(){
		car.assemble();
		System.out.print("-Adding feature of Sports Car.");
	}

}
