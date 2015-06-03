package com.sinha.tutorial.builderDP.AnimalToyExample;

/**
 * 
 * @author kishore
 *
 */
public class DogToyBuilder extends AnimalToyBuilder {

	@Override
	void buildAnimalToyName() {
		System.out.println("Building Dog......");
		getAnimalToy().setAnimalToyName("Dog");
	}

	@Override
	void buildAnimalToyHead() {
		getAnimalToy().setAnimalToyHead("Dog Head");
		System.out.println("Step 1 : Dog Head has been built");
	}

	@Override
	void buildAnimalToyBody() {
		getAnimalToy().setAnimalToyBody("Dog Body");
		System.out.println("Step 2 : Dog Body has been built");
	}

	@Override
	void buildAnimalToyArm() {
		getAnimalToy().setAnimalToyArm("No Arms");
		System.out.println("Step 3 : is skipped beacuse dog does not have Arms");
	}

	@Override
	void buildAnimalToyLegs() {
		getAnimalToy().setAnimalToyLegs("Dog 4 Legs");
		System.out.println("Step 4 : Dog Legs has been built");
	}

	@Override
	void buildAnimalToyTail() {
		getAnimalToy().setAnimalToyTail("Dog Tail");
		System.out.println("Step 5 : Dog Tail has been built");
	}

	@Override
	AnimalToy createAnimalToy() {
		return new AnimalToy();
	}

}
