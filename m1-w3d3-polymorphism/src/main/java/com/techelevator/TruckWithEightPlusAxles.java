package com.techelevator;

public class TruckWithEightPlusAxles implements Vehical {

	@Override
	public double calculateToll(double distance) {
		double toll = distance * 0.045;
		return toll;
	}

	@Override
	public String getName() {
		return "8+ Axle Truck";
	}

}