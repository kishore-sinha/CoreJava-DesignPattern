package com.sinha.tutorial.prototypeDP.AnimalExample;

import java.util.Hashtable;

public class AnimalCache {

	private static Hashtable<String, Animal> animalCache = new Hashtable<String, Animal>();
	
	public static Animal getAnimal(String animalType){
		
		Dog dog = (Dog) animalCache.get(animalType);
		if(dog == null) {
			
			DogLeg dogLeg = new DogLeg();
			dogLeg.setNumberOfLegs(4);
			
			DogEar dogEar = new DogEar();
			dogEar.setNumberOfEars(2);
			
			DogEye dogEye = new DogEye();
			dogEye.setNumberOfEyes(2);
			
			DogTail dogTail = new DogTail();
			dogTail.setTailLength("long");
			
			dog = new Dog("Tommy", 3, "White", dogEar, dogEye, dogLeg, dogTail);
			animalCache.put("Dog", dog);
			System.out.println("New Dog Object is created and return");
			return dog;
		}
		System.out.println("\nCloned Dog Object is created and return");
		return dog.cloneAnimal();
	}
}