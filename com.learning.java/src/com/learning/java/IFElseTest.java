package com.learning.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IFElseTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter number N");
		int N = sc.nextInt();

		if (N % 2 != 0) {
			System.out.println("Weird");
		} else if (N % 2 == 0 && N >= 2 && N <= 5) {
			System.out.println("Not Weird");
		} else if (N % 2 == 0 && N >= 6 && N <= 20) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}
		
		int x = 127;
		if(x>= -127 && x<=127) {
			System.out.println("x can be fitted in :");
			System.out.println(" * byte");
			System.out.println(" * short");
		}

	}
}
