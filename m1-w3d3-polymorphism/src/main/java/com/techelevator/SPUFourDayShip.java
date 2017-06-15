package com.techelevator;

public class SPUFourDayShip implements DeliveryDriver {
	@Override
	public String getName() {
		return "SPU (Four Day)";
	}
	
	@Override
	public double calculateRate(double distance, double weight) {
		return (weight*0.0050)* distance;
	}

}
