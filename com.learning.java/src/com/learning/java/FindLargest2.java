package com.learning.java;

public class FindLargest2 {

	static int biggestofThree(int x, int y, int z) {
		return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
	}

	public static void main(String[] args) {
		System.out.println("Biggeest number is " + biggestofThree(20, 50, 10));

	}

}
