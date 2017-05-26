package com.techelevator;

import java.util.Scanner;


public class VehicalMain {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


		Vehical[] type = new Vehical[] { 
				new Tank(), 
				new TruckWithEightPlusAxles(),
				new TruckWithFourAxles(),
				new TruckWithSixAxles(),
				new Car(),
				new CarWithTrailer()
			};
		
		double distance = 0;
		double howMuch = 0;
		double totalDistance = 0;
		double totalRevenue = 0;
	
		System.out.println();
		System.out.println(String.format("%-30s%-30s%s", "Vehicle", "Distance Traveled" ,"Toll $"));
		System.out.println("----------------------------------------------------------------------");
		
		for(Vehical tolls : type) {
			distance = Math.random()*240+1;
			howMuch = tolls.calculateToll(distance);
			System.out.println(String.format("%-38s%-22.0f$%.02f", tolls.getName(),distance ,howMuch));
			totalDistance += distance;
			totalRevenue += howMuch;
			
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println(String.format("%-32s%-24s%s", "", "Distance Total" ,"Total Revenue"));
		System.out.println("----------------------------------------------------------------------");
		System.out.println(String.format("%-38s%-22.0f$%.02f", "" ,totalDistance ,totalRevenue));

		

	}
	
}
