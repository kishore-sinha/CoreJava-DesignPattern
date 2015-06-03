package com.sinha.tutorial.builderDP.BeverageExample;

/**
 * 
 * @author kishore
 *
 */
public class HotelCustomer {

	public static void main(String[] args) {

		Beverage tea = HotelWaiter.takeOrder("tea");
		System.out.println(tea);
		System.out.println("\n**************************************\n");
		Beverage coffee = HotelWaiter.takeOrder("coffee");
		System.out.println(coffee);
	}
}
