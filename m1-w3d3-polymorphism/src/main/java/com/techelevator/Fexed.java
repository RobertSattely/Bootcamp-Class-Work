package com.techelevator;

public class Fexed implements DeliveryDriver{
	@Override
	public String getName() {
		return "FexEd";
	}

	@Override
	public double calculateRate(double distance, double weight) {
		double rate = 20.00;
		if(distance>500 && weight >48){
			rate += 8.00;
			return rate;
		}else if(distance>500){
			rate += 5.00;
			return rate;
		}else if(weight >48){
			rate += 3.00;
			return rate;
		}else{
			return rate;
		}
	
	}

}
