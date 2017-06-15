package com.techelevator;

public class TruckWithSixAxles implements Vehical{

	@Override
	public double calculateToll(double distance) {
		double toll = distance * 0.045;
		return toll;
	}

	@Override
	public String getName() {
		return "6 Axle Truck";
	}

}