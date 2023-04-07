package com.learning.java;

public class Palindrome {

	public static void main(String[] args) {

		String orgstr = "radar";
		String revstr = "";
		int strlength = orgstr.length();
		for (int i = (strlength - 1); i >= 0; --i) {
			revstr = revstr + orgstr.charAt(i);
			System.out.println(revstr);
		}
		
		if (orgstr.toLowerCase().equals(revstr.toLowerCase())) {
			System.out.println("Word is palindrome seocnd" + orgstr);
		} else {
			System.out.println("Word is not palindrome second" + orgstr);
		}

	}

}
