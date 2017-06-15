package com.techelevator;

import java.util.Scanner;


public class TempConvert {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter the temperature:  ");
				int temperature = input.nextInt();
				input.nextLine();
			System.out.println("Is the temperature in (C)elcius, or (F)arenheit? ");
				String temperatureType = input.nextLine();
				
				
					String farenheit = "F";
					String celcius = "C";
				
				if (temperatureType.equals(celcius)) {
					int answer1 = (int)((temperature * 1.8) + 32);
					System.out.println(temperature + "C is " + answer1 + "F");
				}else if(temperatureType.equals(farenheit)){
					int answer2 =(int)((temperature - 32) / 1.8);
					 System.out.println(temperature + "F is " + answer2 + "C");
				}else {
					System.out.println("looks like we have a problem");
				}
	}

}
