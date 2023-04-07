package com.learning.java;

public class StarPattern2 {

	public static void main(String[] args) {
		int k = 5;
		for (int i = 0; i < k; i++) {
			for (int j = 2 * (k - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (int l = 0; l <= i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
