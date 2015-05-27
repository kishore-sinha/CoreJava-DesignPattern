package com.sinha.tutorial.designPattern.decorator.CarExample;

public class CarClient {

	public static void main(String[] args) {

		BasicCar basicCar = new BasicCar();
		basicCar.assemble();
		System.out.println("\n*****");
		
		Car sportsCar = new SportsCar(basicCar);
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car luxuryCar = new LuxuryCar(basicCar);
		luxuryCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(luxuryCar);
		sportsLuxuryCar.assemble();
		
	}

}
