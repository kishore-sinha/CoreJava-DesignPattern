package com.sinha.tutorial.builderDP.AnimalToyExample;

/**
 * 
 * @author kishore
 *
 */
public abstract class AnimalToyBuilder {

	private AnimalToy animalToy;

	public AnimalToy getAnimalToy() {
		return animalToy;
	}

	public void setAnimalToy(AnimalToy animalToy) {
		this.animalToy = animalToy;
	}
	
	public final AnimalToy buildAnimalToy(){
		AnimalToy animalToyLocal = createAnimalToy();
		setAnimalToy(animalToyLocal);
		buildAnimalToyName();
		buildAnimalToyHead();
		buildAnimalToyBody();
		buildAnimalToyArm();
		buildAnimalToyLegs();
		buildAnimalToyTail();
		return animalToyLocal;
	}
	
	abstract void buildAnimalToyName();
	abstract void buildAnimalToyHead();
	abstract void buildAnimalToyBody();
	abstract void buildAnimalToyArm();
	abstract void buildAnimalToyLegs();
	abstract void buildAnimalToyTail();
	abstract AnimalToy createAnimalToy();
}
