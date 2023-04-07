package com.learning.java;

import java.util.Scanner;

public class CompoundInterest {
	
	public static double compoundInterest(double p1, double r1 , double t1) {
		double cmpInt = p1 * (Math.pow((1 + r1 /100), t1));
		return cmpInt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount");
		double p1 = sc.nextDouble();
		System.out.println("Enter rate of interest");
		double r1 = sc.nextDouble();
		System.out.println("Enter time period ");
		double t1 = sc.nextDouble();
		System.out.println(compoundInterest(p1, r1, t1));

	}

}
