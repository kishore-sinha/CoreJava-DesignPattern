package com.sinha.tutorial.builderDP.AnimalToyExample;

public class MonkeyToyBuilder extends AnimalToyBuilder {

	@Override
	void buildAnimalToyName() {
		System.out.println("Building Monkey......");
		getAnimalToy().setAnimalToyName("Monkey");
	}

	@Override
	void buildAnimalToyHead() {
		getAnimalToy().setAnimalToyHead("Monkey Head");
		System.out.println("Step 1 : Monkey Head has been built");
	}

	@Override
	void buildAnimalToyBody() {
		getAnimalToy().setAnimalToyBody("Monkey Body");
		System.out.println("Step 2 : Monkey Body has been built");
	}

	@Override
	void buildAnimalToyArm() {
		getAnimalToy().setAnimalToyArm("Monkey 2 Arms");
		System.out.println("Step 3 : Monkey Arms has been built");
	}

	@Override
	void buildAnimalToyLegs() {
		getAnimalToy().setAnimalToyLegs("Monkey 2 Legs");
		System.out.println("Step 4 : Monkey Legs has been built");
	}

	@Override
	void buildAnimalToyTail() {
		getAnimalToy().setAnimalToyTail("Monkey Tail");
		System.out.println("Step 5 : Monkey Tail has been built");
	}

	@Override
	AnimalToy createAnimalToy() {
		return new AnimalToy();
	}

}
