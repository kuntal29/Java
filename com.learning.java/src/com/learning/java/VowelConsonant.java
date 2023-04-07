package com.learning.java;

import java.util.Scanner;

public class VowelConsonant {

	public static void vowel_Consonant(char y) {
		if (y == 'A' || y == 'E' || y == 'I' || y == 'O' || y == 'U') {
			System.out.println("Character is vowel");
		} else {
			System.out.println("Character is consonant ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char y = sc.next().charAt(0);
		System.out.println("Enter the character " + y);
		vowel_Consonant(y);
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println("Character is vowel");
			} else {
				System.out.println("Character is consonant ");
			}

		}

	}

}
