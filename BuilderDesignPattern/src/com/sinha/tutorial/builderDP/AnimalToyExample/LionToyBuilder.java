package com.sinha.tutorial.builderDP.AnimalToyExample;

public class LionToyBuilder extends AnimalToyBuilder {

	@Override
	void buildAnimalToyName() {
		System.out.println("Building Lion......");
		getAnimalToy().setAnimalToyName("Lion");
	}

	@Override
	void buildAnimalToyHead() {
		getAnimalToy().setAnimalToyHead("Lion Head");
		System.out.println("Step 1 : Lion Head has been built");
	}

	@Override
	void buildAnimalToyBody() {
		getAnimalToy().setAnimalToyBody("Lion Body");
		System.out.println("Step 2 : Lion Body has been built");
	}

	@Override
	void buildAnimalToyArm() {
		getAnimalToy().setAnimalToyArm("No Arms");
		System.out.println("Step 3 : is skipped beacuse Lion does not have Arms");
	}

	@Override
	void buildAnimalToyLegs() {
		getAnimalToy().setAnimalToyLegs("Lion 4 Legs");
		System.out.println("Step 4 : Lion Legs has been built");
	}

	@Override
	void buildAnimalToyTail() {
		getAnimalToy().setAnimalToyTail("Lion Tail");
		System.out.println("Step 5 : Lion Tail has been built");
	}

	@Override
	AnimalToy createAnimalToy() {
		return new AnimalToy();
	}

}
