package com.learning.java;

import java.util.ArrayList;
import java.util.List;

public class ArraySearch {

	public static void main(String[] args) {
		List<Integer> intArr = new ArrayList<Integer>();
		
		intArr.add(10);
		intArr.add(5);
		intArr.add(20);
		intArr.add(40);
		
		if (intArr.contains(25)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println(intArr.contains(10));

	}
//test
}
