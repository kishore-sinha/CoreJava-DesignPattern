package com.sinha.tutorial.prototypeDP.AnimalExample;

public class ProtoTypeDPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = (Dog) AnimalCache.getAnimal("Dog");
		System.out.println(dog);
		
		Dog clonneddog1 = (Dog) AnimalCache.getAnimal("Dog");
		clonneddog1.setName("Johny");
		clonneddog1.setAge(4);
		clonneddog1.setColor("brown");
		System.out.println(clonneddog1);
		
		Dog clonneddog2 = (Dog) AnimalCache.getAnimal("Dog");
		clonneddog2.setName("Tony");
		clonneddog2.setAge(5);
		clonneddog2.setColor("brown");
		System.out.println(clonneddog2);
		
		Dog clonneddog3 = (Dog) AnimalCache.getAnimal("Dog");
		clonneddog3.setName("Jimmy");
		clonneddog3.setAge(8);
		clonneddog3.setColor("brown");
		clonneddog3.getDogTail().setTailLength("Small");;
		System.out.println(clonneddog3);
	}

}
