package com.learning.java;

public class SwapNumbers {
	
	//Without static 
	
	public void swappingNumber(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
		System.out.println("Swaping of M and N is " + m + "  " + n);
	}
	
	
	// With Static method and without creating instance 
	public static void swappingNumber1(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Swaping of x and y is " + x + "  " + y);
	}

	public static void main(String[] args) {
		int m = 5;
		int n = 9;
		int x = 10;
		int y = 20;
		SwapNumbers swp = new SwapNumbers();
		swp.swappingNumber(m, n);
		
		swappingNumber1(x, y);

	}

}
