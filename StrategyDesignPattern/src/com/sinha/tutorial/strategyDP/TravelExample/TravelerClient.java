package com.sinha.tutorial.strategyDP.TravelExample;

public class TravelerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TravelContext travelContext = new TravelContext();
		travelContext.setTravelStrategy(new TaxiTravelStrategy());
		travelContext.goToAirport();
		
		travelContext.setTravelStrategy(new AutoTravelStrategy());
		travelContext.goToAirport();
		
		travelContext.setTravelStrategy(new TrainTravelStrategy());
		travelContext.goToAirport();
		
		travelContext.setTravelStrategy(new BusTravelStrategy());
		travelContext.goToAirport();
	}

}
