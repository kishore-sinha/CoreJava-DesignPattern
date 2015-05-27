package com.sinha.tutorial.singletonDP;

/**
 * 
 * @author kishore
 *
 * This is the example of Singleton Design Pattern with Double Check Locking Implementation.
 * Consider multi-threaded scenario, where multiple thread can actually tries to create the
 * instance of singleton class.
 * Hence in this scenario, the example put in SingletonLazyInit, can actually create multiple instance.
 * To avoid that we can create a Singleton class with Double Check Locking implementation.   
 */
public class SingletonDobleCheck {

	private static SingletonDobleCheck doubleCheck;
	
	private SingletonDobleCheck(){
		
	}
	
	public static SingletonDobleCheck getDoubleCheckInstance(){
		if(doubleCheck == null){
			synchronized (SingletonDobleCheck.class) {
				if(doubleCheck == null){
					doubleCheck = new SingletonDobleCheck();
					System.out.println("Creating Singleton Instace of SingletonDobleCheck");
				}
			}
		}
		return doubleCheck;
	}
	
	public void printSingletonDobleCheck(){
		System.out.println("Inside printSingletonDobleCheck");
	}
}
