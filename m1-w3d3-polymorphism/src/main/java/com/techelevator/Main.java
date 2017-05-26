package com.techelevator;

import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


	
		DeliveryDriver[] drivers = new DeliveryDriver[] { 
			new PostalServiceClassOne(), 
			new PostalServiceClassTwo(),
			new PostalServiceClassThree(),
			new Fexed(),
			new SPUFourDayShip(),
			new SPUNextDayShip(),
			new SPUTwoDayShip()
		};
	
		System.out.print("Please enter the weight of the package? ");
		double weight = input.nextDouble();
		input.nextLine();
	
		System.out.print("(P)ounds or (O)unces? ");
		String poundsOrOunces = input.nextLine();
		if( poundsOrOunces.equals("P")) {
			weight *= 16;
		}

		System.out.print("What distance will it be traveling to? ");
		double distance = input.nextDouble();
		input.nextLine();
	
		System.out.println();
		System.out.println(String.format("%-30s%s", "Delivery Service", "$ Cost"));
		System.out.println("-------------------------------------");
		for(DeliveryDriver cost : drivers) {
			double howMuch = cost.calculateRate(distance, weight);
			System.out.println(String.format("%-30s$%.02f", cost.getName(), howMuch));
		}
	}
	
}
