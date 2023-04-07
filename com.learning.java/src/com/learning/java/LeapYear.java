package com.learning.java;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to identify");
		int lpy = sc.nextInt();
		if ((lpy % 400 == 0 ) ||( lpy % 4 == 0) && (lpy % 100 != 0)) {
			System.out.println("IT is a leap year");
		} else {
			System.out.println("IT is not a leap year");
		}
	}

}
