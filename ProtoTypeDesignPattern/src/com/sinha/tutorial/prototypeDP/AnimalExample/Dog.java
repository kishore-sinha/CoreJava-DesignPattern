package com.sinha.tutorial.prototypeDP.AnimalExample;

public class Dog implements Animal{

	private String name;
	private int age; 
	private String color;
	private DogEar dogEar;
	private DogEye dogEye;
	private DogLeg dogLeg;
	private DogTail dogTail;
	
	public Dog(String name, int age, String color, DogEar dogEar,
			DogEye dogEye, DogLeg dogLeg, DogTail dogTail) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.dogEar = dogEar;
		this.dogEye = dogEye;
		this.dogLeg = dogLeg;
		this.dogTail = dogTail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public DogEar getDogEar() {
		return dogEar;
	}

	public void setDogEar(DogEar dogEar) {
		this.dogEar = dogEar;
	}

	public DogEye getDogEye() {
		return dogEye;
	}

	public void setDogEye(DogEye dogEye) {
		this.dogEye = dogEye;
	}

	public DogLeg getDogLeg() {
		return dogLeg;
	}

	public void setDogLeg(DogLeg dogLeg) {
		this.dogLeg = dogLeg;
	}

	public DogTail getDogTail() {
		return dogTail;
	}

	public void setDogTail(DogTail dogTail) {
		this.dogTail = dogTail;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", color=" + color
				+ ", dogEar=" + dogEar + ", dogEye=" + dogEye + ", dogLeg="
				+ dogLeg + ", dogTail=" + dogTail + "]";
	}

	public Animal cloneAnimal() {
		// TODO Auto-generated method stub
		
		Dog dogObject = null;
		try {
			dogObject = (Dog) super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return dogObject;
	}
}
