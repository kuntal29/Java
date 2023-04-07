package com.learning.java;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i;
		int m = 0;
		int flag = 0;
		int n = 5; // number checking
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " n is not prime");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + "n is not prime");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + "number is prime");
			}

		}

	}

}
