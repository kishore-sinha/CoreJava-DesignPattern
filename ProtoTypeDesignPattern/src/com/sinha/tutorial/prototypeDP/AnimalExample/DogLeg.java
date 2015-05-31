package com.sinha.tutorial.prototypeDP.AnimalExample;

public class DogLeg {

	private int numberOfLegs;

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return "DogLeg [numberOfLegs=" + numberOfLegs + "]";
	}
}
