package com.sinha.tutorial.strategyDP.PaymentExample;

public class ByCashPaymentStrategy implements PaymentStrategy {

	public void payAmount(String amount) {
		// TODO Auto-generated method stub
		System.out.println("Customer has paid the money Rs."+amount+" using Cash");
	}

}
