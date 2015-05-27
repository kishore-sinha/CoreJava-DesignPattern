package com.sinha.tutorial.decoratorDP.CarExample;

public abstract class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car newCar){
		this.car = newCar;
	}
	@Override
	public void assemble() {
		this.car.assemble();
	}

}
