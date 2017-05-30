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
			 N = N.replaceFirst("CM", "");
		 } while (N.contains("CD")) {
             roman += 400;
             N = N.replaceFirst("CD", "");
            
         } while (N.contains("XC")) {
             roman += 90;
            N = N.replaceFirst("XC", "");
         
         } while (N.contains("IV")) {
        	 roman += 4;
        	N = N.replaceFirst("IV", "");	
        	 
         } while (N.contains("XL")) {
        	 roman += 40;
        	N = N.replaceFirst("XL", "");
        	 
         } while (N.contains("M")) {
                 roman += 1000;
             N = N.replaceFirst("M", "");
            
         } while (N.contains("D")) {
                 roman += 500;
             N = N.replaceFirst("D", "");
                 
         } while (N.contains("C")) {
             roman += 100;
             N = N.replaceFirst("C", "");
             
         } while (N.contains("L")) {
        	 roman += 50;
        	 N = N.replaceFirst("L", "");
            
         } while (N.contains("X")) {
             roman += 10;
             N = N.replaceFirst("X", "");
                
         } while (N.contains("V")) {
             roman += 5;
             N = N.replaceFirst("V", "");
 
         } while (N.contains("I")) {
             roman += 1;
             N = N.replaceFirst("I", "");
         }	
         
         System.out.println(roman + " Crazy huh!");	

 	}
	
}
