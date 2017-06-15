package com.techelevator;

public class TruckWithFourAxles implements Vehical{

	@Override
	public double calculateToll(double distance) {
		double toll = distance * 0.04;
		return toll;
	}

	@Override
	public String getName() {
		return "4 Axle Truck";
	}

}
