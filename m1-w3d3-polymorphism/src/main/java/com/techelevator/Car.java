package com.techelevator;

public class Car implements Vehical{

	@Override
	public double calculateToll(double distance) {
		double toll = distance * 0.02;
		return toll;
	}

	@Override
	public String getName() {
		return "Car";
	}

}
