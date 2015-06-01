package com.sinha.tutorial.strategyDP.PaymentExample;

import java.util.Scanner;

public class Customer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please Enter Payment Method : 'CreditCard' or 'DebitCard' or 'ByCash' ");
		Scanner scanner = new Scanner(System.in);
		String paymentMode = scanner.next();
		System.out.println("Payment Method is : "+paymentMode+"\n");
		
		System.out.println("Please enter Amount to Pay : ");
		Scanner scanner2 = new Scanner(System.in);
		String amount = scanner2.next();
		System.out.println("Amount to Pay is : "+amount+"\n");
		
		PaymentContext paymentContext = new PaymentContext();
		if("Creditcard".equalsIgnoreCase(paymentMode))
			paymentContext.setPaymentStrategy(new CreditCardPaymentStrategy());
		else if("Debitcard".equalsIgnoreCase(paymentMode))
			paymentContext.setPaymentStrategy(new DebitCardPaymentStrategy());
		else if("ByCash".equalsIgnoreCase(paymentMode))
			paymentContext.setPaymentStrategy(new ByCashPaymentStrategy());
		paymentContext.payAmount(amount);
	}

}
