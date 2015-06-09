package com.sinha.tutorial.mediatorDP.FBGroupExample;

/**
 * 
 * @author kishore
 *
 */
public class FBGroupClient {

	public static void main(String[] args) {

		FBGroupMediator fbGroupMediator = new FBGroupMediatorImpl();
		
		User dev = new UserImpl(fbGroupMediator, "Dev"); 
		User mahesh = new UserImpl(fbGroupMediator, "Mahesh");
		User suresh = new UserImpl(fbGroupMediator, "Suresh");
		User rajesh = new UserImpl(fbGroupMediator, "Rajesh");
		User raj = new UserImpl(fbGroupMediator, "Raj");
		User rahul = new UserImpl(fbGroupMediator, "Rahul");
		User raju = new UserImpl(fbGroupMediator, "Raju");
		User steve = new UserImpl(fbGroupMediator, "Steve");
		User john = new UserImpl(fbGroupMediator, "John");
		
		fbGroupMediator.registerUser(dev);
		fbGroupMediator.registerUser(mahesh);
		fbGroupMediator.registerUser(suresh);
		fbGroupMediator.registerUser(rajesh);
		fbGroupMediator.registerUser(raj);
		fbGroupMediator.registerUser(rahul);
		fbGroupMediator.registerUser(raju);
		fbGroupMediator.registerUser(steve);
		fbGroupMediator.registerUser(john);
		
		raj.send("Core Java Design Pattern Tutorial is very useful");
		
		System.out.println("\n################################################################################\n");
		
		mahesh.send("Please explain the New Features of Java-8");
	}

}
