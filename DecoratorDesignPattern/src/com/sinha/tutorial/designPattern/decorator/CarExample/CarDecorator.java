package com.sinha.tutorial.designPattern.decorator.CarExample;

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
