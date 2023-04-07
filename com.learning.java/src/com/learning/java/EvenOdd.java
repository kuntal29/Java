package com.learning.java;

import java.util.Scanner;

public class EvenOdd {

	// by using static method
	public static void evenOdd(int y) {
		if (y % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}
	
	// by using constructor
	public EvenOdd(int j) {
		if (j % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int j = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
		evenOdd(y);
		EvenOdd num = new EvenOdd(j);

	}

}
