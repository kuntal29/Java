package com.learning.java;

import java.util.Scanner;

public class FindLargestNum {

	// Find largest number using method
	public static void findLargest(int a, int b, int c) {
		try {
			if (a > b && a > c) {
				System.out.println("X is largest " + a);
			} else if (b > a && b > c) {
				System.out.println("y is largest " + b);
			} else {
				System.out.println("z is largest " + c);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// int x = 20;
		// int y = 30;
		// int z = 40;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number first");
			int x = sc.nextInt();
			System.out.println("Enter number two");
			int y = sc.nextInt();
			System.out.println("Enter number three");
			int z = sc.nextInt();
			// Using method largest
			findLargest(x, y, z);
			// Using if Condition
			if (x > y && x > z) {
				System.out.println("X is largest " + x);
			} else if (y > x && y > z) {
				System.out.println("y is largest " + y);
			} else {
				System.out.println("z is largest " + z);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
