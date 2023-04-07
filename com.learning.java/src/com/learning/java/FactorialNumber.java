package com.learning.java;

public class FactorialNumber {

	// method to find factorial of given number

	static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	static int factn(int k) {
		int fact = 1;
		int i;
		for (i = 2; i <= k; i++)
			fact = fact * i;
		return fact;
	}

	public static void main(String[] args) {
		// int n = 5;
		// int fact = n * (n-1) * (n-2) * (n-3) * (n-4);
		// System.out.println(fact);

		System.out.println(factorial(10));
		System.out.println(factn(5));

	}

}
