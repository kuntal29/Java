package com.learning.java;

import java.util.Scanner;

public class SimpleInterest {
	
	
	// Simple method
	public static int simpInterest (int p, int r , int t) {
		 int simpInt = (p * r * t)/100;
				 return simpInt;
	}
	
	// Simple method way 2
	public static double simpInterest1 (double p1, double r1 , double t1) {
		double simpInt = (p1 * r1 * t1)/100;
				 return simpInt;
	}
	
	// Using constructor 
	public SimpleInterest (double p2, double r2 , double t2) {
		double simpInt = (p2 * r2 * t2)/100;
		System.out.println(simpInt);
		
	}
	
	

	public static void main(String[] args) {
		System.out.println(simpInterest(100, 10, 10));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount");
		double p1 = sc.nextDouble();
		System.out.println("Enter rate of interest");
		double r1 = sc.nextDouble();
		System.out.println("Enter time period ");
		double t1 = sc.nextDouble();
		System.out.println("Simple Interest is = " +  simpInterest1(p1, r1, t1));
		SimpleInterest simp1 = new SimpleInterest(p1, r1, t1);
		
		

	}

}
