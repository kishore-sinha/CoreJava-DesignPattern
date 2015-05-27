package com.sinha.kishore.singleton;

/**
 * 
 * @author kishore
 *
 * This is the example of Singleton Design Patter with Lazy Initialization implementation.
 * Unless required, the instance of SingletonLazyInit will not be created.
 * At very first call, the instance of SingletonLazyInit class will be created.
 * 
 */
public class SingletonLazyInit {
	
	private static SingletonLazyInit lazyInit;
	
	private SingletonLazyInit(){
		
	}
	
	public static SingletonLazyInit getSingletonInstance(){
		if(lazyInit == null){
			lazyInit = new SingletonLazyInit();
			System.out.println("Creating Singleton Instance");
		}
		
		return lazyInit;
	}
	
	public void printSingleton(){
		System.out.println("Inside print Singleton");
	}

}
