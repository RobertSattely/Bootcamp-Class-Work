package com.techelevator;

public class SPUNextDayShip  implements DeliveryDriver {
	@Override
	public String getName() {
		return "SPU (Next Day)";
	}
	
	@Override
	public double calculateRate(double distance, double weight) {
		return (weight*0.075)* distance;
	}
}
