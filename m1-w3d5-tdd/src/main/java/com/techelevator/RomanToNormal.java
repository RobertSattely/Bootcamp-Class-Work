package com.techelevator;

import java.util.Scanner;

public class RomanToNormal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Speak to me in roman numerals?");
			
		String numerals = input.nextLine();

	    int roman = 0;
	    String N = numerals ;
         
		 while (N.contains("CM")) {
             roman += 900;
//             N.replace("CM", "");
             
		 } while (N.contains("CD")) {
             roman += 400;
//             N.replace("CD", "");
            
         } while (N.contains("XC")) {
             roman += 90;
//             N.replace("XC", "");
         
         } while (N.contains("IV")) {
        	 roman += 4;
//        	 N.replace("IV", "");	
        	 
         } while (N.contains("XL")) {
        	 roman += 40;
//        	 N.replace("XL", "");
        	 
         } while (N.contains("M")) {
                 roman += 1000;
//                 N.replace("M", "");
            
         } while (N.contains("D")) {
                 roman += 500;
//                 N.replace("D", "");
                 
         } while (N.contains("C")) {
             roman += 100;
//             N.replace("C", "");
             
         } while (N.contains("L")) {
        	 roman += 50;
//        	 N.replace("L", "");
            
         } while (N.contains("X")) {
             roman += 10;
             N.replace("X", "");
                
         } while (N.contains("V")) {
             roman += 5;
//             N.replace("V", "");
 
         } while (N.contains("I")) {
             roman += 1;
//             N.replace("I", "");
         }	
         
         System.out.println(roman + " Crazy huh!");	

 	}
	
}
