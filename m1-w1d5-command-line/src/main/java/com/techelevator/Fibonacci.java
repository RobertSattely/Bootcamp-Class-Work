package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
               
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the Fibonacci number:");
		int fibonacciNumber = input.nextInt();
		input.nextLine();
		
		System.out.println("Thats a great number, here is the numbers leading to your choice.");
		
				int a = 0;
				int b = 1;
				int c = a + b;
				System.out.print(a + " ");
				
				for( int i=0; c<fibonacciNumber; i++){
	                	System.out.print( c +" ");
							c = (a + b);
							a = b;
							b = c;
				}
		}
}
