package com.sinha.tutorial.builderDP.AnimalToyExample;

/**
 * 
 * @author kishore
 *
 */
public class ToyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalToy dogToy = ToyMaker.makeToy("Dog");
		System.out.println(dogToy);
		System.out.println("\n*****************************\n");
		
		AnimalToy lionlToy = ToyMaker.makeToy("Lion");
		System.out.println(lionlToy);
		System.out.println("\n*****************************\n");
		
		AnimalToy monkeyToy = ToyMaker.makeToy("Monkey");
		System.out.println(monkeyToy);
	}

}
