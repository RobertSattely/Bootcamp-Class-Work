package com.techelevator;

public class PostalServiceClassTwo implements DeliveryDriver {
	@Override
	public String getName() {
		return "Postal Service (2nd Class)";
	}

	@Override
	public double calculateRate(double distance, double weight) {
		
		if(weight<= 2){
			double secondClass = .0035 * distance;
			return secondClass;
		}else if(weight<=8){
			double secondClass = .004 * distance;
			return secondClass;
		}else if(weight<=15){
			double secondClass = .0047 * distance;
			return secondClass;
		}else if(weight<=48){
			double secondClass = .0195 * distance;
			return secondClass;
		}else if(weight<=128 ){
			double secondClass = .045 * distance;
			return secondClass;
		}else{
			double secondClass = .05 * distance;
			return secondClass;
		}
	}

	
}
