package com.sinha.tutorial.mediatorDP.FBGroupExample;

/**
 * 
 * @author kishore
 *
 */
public interface FBGroupMediator {

	public void sendMessage(String msg, User user);
	
	public void registerUser(User user);
}
