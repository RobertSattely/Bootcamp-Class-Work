package com.techelevator;

import java.util.Scanner;

public class KataRomanNumerals {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Is there a number you would like to see in roman numerals?");
			
		int number = input.nextInt();

	    String roman = "";
	    int N = number ;
         
         while (N >= 1000) {
             roman += "M";
              N -= 1000;
            
         } while (N >= 900) {
             roman += "CM";
             N -= 900;
        
         } while (N >= 500) {
             roman += "D";
             N -= 500;
         
         } while (N >= 400) {
             roman += "CD";
             N -= 400;
            
         } while (N >= 100) {
             roman += "C";
             N -= 100;
            
         } while (N >= 90) {
             roman += "XC";
             N -= 90;
            
         } while (N >= 50) {
        	 roman += "L";
        	 N -= 50;
         } while (N >= 40) {
        	 roman += "XL";
        	 N -= 40;
            
         } while (N >= 10) {
             roman += "X";
             N -= 10;
                
         } while (N >= 5) {
             roman += "V";
             N -= 5;
                
         }while (N >= 4) {
        	 roman += "IV";
             N -= 4;
                
         } while (N >= 1) {
             roman += "I";
             N -= 1;
         }			System.out.println(roman + " Crazy huh!");	

 	}
	



}