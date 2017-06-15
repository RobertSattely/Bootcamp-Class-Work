package com.techelevator;

public class CarWithTrailer implements Vehical {

	@Override
	public double calculateToll(double distance) {
		double toll = (distance * 0.020) + 1;
		return toll;
	}

	@Override
	public String getName() {
		return "Car w/Trailer";
	}

}
