package com.sinha.tutorial.templateDP;

public class HousingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Build Wooden House");
		HouseTemplate woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();
		System.out.println("***********************************************");
		
		System.out.println("Build Glass House");
		HouseTemplate glassHouse = new GlassHouse();
		glassHouse.buildHouse();
		System.out.println("***********************************************");
		
		System.out.println("Build Concreate House");
		HouseTemplate concreateHouse = new ConcreateHouse();
		concreateHouse.buildHouse();
		System.out.println("***********************************************");
		
	}

}
