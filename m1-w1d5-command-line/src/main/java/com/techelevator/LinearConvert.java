package com.techelevator;

import java.util.Scanner;


public class LinearConvert {

	public static void main(String[] args) {


	Scanner input = new Scanner(System.in);

		String feet = "f";
		String meter = "m";
	
		System.out.println("Please enter the length:  ");
			int length = input.nextInt();
				input.nextLine();
	
		System.out.println("Is the temperature in (m)eter, or (f)eet? ");
			String lengthMeasurement = input.next();
	
		  if (lengthMeasurement.equalsIgnoreCase(feet)) {
			int answer1 = (int)(length * 0.3048);
			System.out.println(length + " feet is " + answer1 + " meters");
		
		  }else if (lengthMeasurement.equalsIgnoreCase(meter)){
			int answer2 =(int)(length * 3.2808399);
			 System.out.println(length+ " Meters is " + answer2 + " Feet");
		  
		  }else {
			System.out.println("looks like we have a problem");
		}

	}
}
