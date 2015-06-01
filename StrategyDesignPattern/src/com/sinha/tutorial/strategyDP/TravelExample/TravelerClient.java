package com.sinha.tutorial.strategyDP.TravelExample;

import java.util.Scanner;

public class TravelerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please Enter Travel Mode : 'Bus' or 'Train' or 'Auto' or 'Taxi' ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String travelMode = scanner.next();
		System.out.println("Travel Mode is : "+travelMode);
		
		TravelContext travelContext = new TravelContext();
		if("Taxi".equalsIgnoreCase(travelMode)) {
			travelContext.setTravelStrategy(new TaxiTravelStrategy());
		}
		else if("Auto".equalsIgnoreCase(travelMode)) {
			travelContext.setTravelStrategy(new AutoTravelStrategy());
		}
		else if("Train".equalsIgnoreCase(travelMode)) {
			travelContext.setTravelStrategy(new TrainTravelStrategy());
		}
		else if("Bus".equalsIgnoreCase(travelMode)) {
			travelContext.setTravelStrategy(new BusTravelStrategy());
		}
		travelContext.goToAirport();
	}

}
