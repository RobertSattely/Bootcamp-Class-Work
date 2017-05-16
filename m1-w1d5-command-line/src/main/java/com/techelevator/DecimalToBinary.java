package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			new StringBuilder().reverse().toString();
			int usersNumber;
			String result = "";
			
			System.out.println("Please enter in a series of deciaml vales (separated by spaces):");
			
			usersNumber = input.nextInt();
			input.nextLine();
			
			System.out.println("Wow, thats a hard one.. let me compute");
				
			while (usersNumber >0){
				    int magic = usersNumber%2;
				    usersNumber = usersNumber/2;
				    result =  magic + result;
				    
			}System.out.print(result);
	} 
}
