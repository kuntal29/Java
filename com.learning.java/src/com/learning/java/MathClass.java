package com.learning.java;

public class MathClass {
	
	public static void main (String args[]) {
		
		double x = 10;
		double y = 2;
		int z = 25;
		
		System.out.println("The max number is " + Math.max(x, y));
		
		System.out.println("The min number is " + Math.min(x, y));
		
		// return square root of y

		System.out.println("swaure root of z is " + Math.sqrt(z));
		
	       
        //returns 10 power of 2 i.e. 10 X 10
		
		System.out.println("The power of x and y is " + Math.pow(x, y));
		
		// return the logarithm of given value
		
		System.out.println(" the log of y is " + Math.log(y));
		
		// return the logarithm of given value when base is 10 
		
		System.out.println(" the log of z is " + Math.log10(z));
	
	}
		 

}
