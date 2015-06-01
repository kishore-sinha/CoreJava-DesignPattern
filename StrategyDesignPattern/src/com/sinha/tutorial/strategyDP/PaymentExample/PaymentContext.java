package com.sinha.tutorial.strategyDP.PaymentExample;

public class PaymentContext {

	PaymentStrategy paymentStrategy;
	
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void payAmount(String amount) {
		paymentStrategy.payAmount(amount);
	}
}
