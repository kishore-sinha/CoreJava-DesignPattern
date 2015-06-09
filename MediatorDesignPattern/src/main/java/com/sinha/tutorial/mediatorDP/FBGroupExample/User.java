package com.sinha.tutorial.mediatorDP.FBGroupExample;

/**
 * 
 * @author kishore
 *
 */
public abstract class User {

	protected FBGroupMediator groupMediator;
	protected String name;
	
	public User(FBGroupMediator groupMediator, String name) {
		super();
		this.groupMediator = groupMediator;
		this.name = name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
}
