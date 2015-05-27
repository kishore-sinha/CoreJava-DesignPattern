package com.sinha.tutorial.decoratorDP.CarExample;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car newCar) {
		super(newCar);
	}

	public void assemble(){
		car.assemble();
		System.out.print("-Adding features of Luxury Car.");
	}
}
