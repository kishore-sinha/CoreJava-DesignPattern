package com.sinha.tutorial.builderDP.BeverageExample;

public class HotelWaiter {

	public static Beverage takeOrder (String beverageType) {
		
		BeverageBuilder beverageBuilder = null;
		
		if("tea".equalsIgnoreCase(beverageType)) {
		
			beverageBuilder = new TeaBuilder();
		}
		else if("coffee".equalsIgnoreCase(beverageType)) {
			
			beverageBuilder = new CoffeeBuilder();
		}
		else {
			System.out.println("Sorry, We dont take order for "+beverageType);
		}
		return beverageBuilder.buildBeverage();
	}
}
