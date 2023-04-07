package com.learning.java;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String A = sc.next();
		System.out.println(A);
		char ch;
		String rev = "";
		for (int i = 0; i <= A.length(); i++) {
			ch = A.charAt(i);
			rev = ch + rev;
		}
			if (rev == A) {
				System.out.println("word is palindrome");
			} else {
				System.out.println("Word is not palindrome");
			}
		}

	}


