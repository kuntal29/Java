package com.learning.java;

import java.util.Scanner;

public class ReadNumberScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		System.out.println("Entered the number is " + i);
		String k = sc.nextLine();

	}

}
