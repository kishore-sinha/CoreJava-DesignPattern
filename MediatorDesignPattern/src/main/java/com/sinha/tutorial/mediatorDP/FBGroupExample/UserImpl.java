package com.sinha.tutorial.mediatorDP.FBGroupExample;

/**
 * 
 * @author kishore
 *
 */
public class UserImpl extends User {

	public UserImpl(FBGroupMediator groupMediator, String name) {
		super(groupMediator, name);
	}

	@Override
	public void send(String msg) {
		
		System.out.println(this.name +": Sending Message= "+msg+"\n");
		groupMediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {

		System.out.println(this.name +": Received Message= "+msg);
	}

}
