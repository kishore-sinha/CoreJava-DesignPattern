package com.sinha.tutorial.templateDP.CofeeExample;

public class CoffeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Preparing Bru Coffee....");
		
		CoffeeTemplate bruCoffee = new BruCoffee();
		bruCoffee.prepareCofee();
		System.out.println("*******************************************************");
	
		System.out.println("Preparing Nescafe Coffee....");
		
		CoffeeTemplate nescafeCoffee = new BruCoffee();
		nescafeCoffee.prepareCofee();
		System.out.println("*******************************************************");
	}

}
