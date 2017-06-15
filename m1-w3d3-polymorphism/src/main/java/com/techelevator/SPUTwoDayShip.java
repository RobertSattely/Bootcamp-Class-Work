package com.techelevator;

public class SPUTwoDayShip implements DeliveryDriver {
	@Override
	public String getName() {
		return "SPU (Two Day)";
	}

	@Override
	public double calculateRate(double distance, double weight) {
		return (weight*0.050)* distance;
	}
	

}
