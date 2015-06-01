package com.sinha.tutorial.strategyDP.TravelExample;

public class TravelContext {

	TravelStrategy travelStrategy;
	
	public void setTravelStrategy(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}
	public void goToAirport() {
		travelStrategy.goToAirport();
	}
}
