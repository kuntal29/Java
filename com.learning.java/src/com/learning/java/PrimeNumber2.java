package com.learning.java;

public class PrimeNumber2 {

	static void primeN(int N) {
		int x, y, flag;

		// PRinting display message
		System.out.println("All the prime number within 1 and N are " + N);

		// Using for loop for traversing all
		// the numbers from 1 to N
		for (x = 1; x <= N; x++) {
			if (x == 0 || x == 1) {
				continue;
				// Using flag variable to check
				// if x is prime or not
			}
			flag = 1;
			for (y = 2; y <= x / 2; y++) {
				if (x % y == 0) {
					flag = 0;
					break;
				}
			}
			if (flag ==1) {
				System.out.println(x + " ");
			}
		}
	}

	public static void main(String[] args) {
		int N = 5;
		primeN(N);

	}

}
