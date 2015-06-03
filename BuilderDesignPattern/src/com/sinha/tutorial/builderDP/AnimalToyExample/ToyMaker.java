package com.sinha.tutorial.builderDP.AnimalToyExample;

public class ToyMaker {

	public static AnimalToy makeToy(String toyType) {
		
		AnimalToyBuilder animalToyBuilder = null;
		
		if("Dog".equalsIgnoreCase(toyType)) {
			
			animalToyBuilder = new DogToyBuilder();
		}
		else if ("Lion".equalsIgnoreCase(toyType)) {
			
			animalToyBuilder = new LionToyBuilder();
		}
		else if ("Monkey".equalsIgnoreCase(toyType)) {
			
			animalToyBuilder = new MonkeyToyBuilder();
		}
		return animalToyBuilder.buildAnimalToy();
	}
}
