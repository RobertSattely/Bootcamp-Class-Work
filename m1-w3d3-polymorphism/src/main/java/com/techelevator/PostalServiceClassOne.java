package com.techelevator;

public class PostalServiceClassOne implements DeliveryDriver {
	@Override
	public String getName() {
		return "Postal Service (1st Class)";
	}
	
	@Override
	public double calculateRate(double distance, double weight) {
		
		if(weight<= 2){
			double firstClass = .035 * distance;
			return firstClass;
		}else if(weight<=8){
			double firstClass = .04 * distance;
			return firstClass ;
		}else if(weight<=15){
			double firstClass = .047 * distance;
			return firstClass;
		}else if(weight<=48){
			double firstClass = .195 * distance;
			return firstClass;
		}else if(weight<=128 ){
			double firstClass = .45 * distance;
			return firstClass;
		}else{
			double firstClass = .5 * distance;
			return firstClass;
		}
	}

	
}
