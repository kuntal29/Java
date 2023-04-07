package com.learning.java;

public class ToString {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("I will make it");
		str.append(0);
		System.out.println(str);
		System.out.println(str.capacity());
		System.out.println(str.length());
		System.out.println(str.toString());
		System.out.println(str.substring(2, 6));
		System.out.println(str.charAt(3));
		
		for (int i=0; i< str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

}
