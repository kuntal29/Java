package com.learning.java;

import java.util.Scanner;

public class NeonNumber {

	public static boolean checkNeon(int n) {
		int square = n * n;
		int sum = 0;
		while (square > 0) {
			int r = square % 10;
			square = square / 10;
			sum +=  r;
			System.out.println(sum + "SUM is ");
		}
		if (sum == n)

			// number is neon
			return true;
		else

			// number is not neon
			return false;
	}

	public static void main(String[] args) {
		{
			// Custom input
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();

			// Calling above function to check custom number or
			// if user entered number via Scanner class
			if (checkNeon(n))

				// Print number considered is neon
				System.out.println("Given number " + n + " is Neon number");
			else

				// Print number considered is not neon
				System.out.println("Given number " + n + " is not a Neon number");
		}
		int k = 81 % 10;
		int j = 81/10;
		System.out.println(k + " " +  j);
	}
}
