package com.sinha.kishore.singleton;

public class SingletonDemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonLazyInit.getSingletonInstance().printSingleton();
		SingletonLazyInit.getSingletonInstance().printSingleton();
		System.out.println("");
		SingletonDobleCheck.getDoubleCheckInstance().printSingletonDobleCheck();
		SingletonDobleCheck.getDoubleCheckInstance().printSingletonDobleCheck();
	}

}
