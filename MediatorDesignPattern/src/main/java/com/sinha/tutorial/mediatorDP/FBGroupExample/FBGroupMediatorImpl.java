package com.sinha.tutorial.mediatorDP.FBGroupExample;


/**
 * 
 * @author kishore
 *
 */
import java.util.ArrayList;
import java.util.List;

public class FBGroupMediatorImpl implements FBGroupMediator {

	List<User> userList;
	
	public FBGroupMediatorImpl() {
		super();
		this.userList = new ArrayList<User>();
	}

	public void sendMessage(String msg, User user) {

		for (User user1 : userList) {
			
			//Message should not be received by the user who is sending it.
			if(user1 != user) {
				user1.receive(msg);
			}
		}
	}

	public void registerUser(User user) {
	
		userList.add(user);
	}

}
