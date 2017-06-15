package com.techelevator;

public class PostalServiceClassThree  implements DeliveryDriver{
	@Override
	public String getName() {
		return "Postal Service (3rd Class)";
	}

	@Override
	public double calculateRate(double distance, double weight) {
		
		if(weight<= 2){
			double thirdClass = .002 * distance;
			return thirdClass;
		}else if(weight<=8){
			double thirdClass = .0022 * distance;
			return thirdClass;
		}else if(weight<=15){
			double thirdClass = .0024 * distance;
			return thirdClass;
		}else if(weight<=48){
			double thirdClass = .015 * distance;
			return thirdClass;
		}else if(weight<=128 ){
			double thirdClass = .016 * distance;
			return thirdClass;
		}else{
			double thirdClass = .017 * distance;
			return thirdClass;
		}
	}

	
}
