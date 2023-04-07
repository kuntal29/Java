package com.learning.java;

import java.util.ArrayList;

public class ReplaceElementinArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Double> list1 = new ArrayList<Double>();

		for (int i = 0; i <= 5; i++) {
			list.add(i);

		}

		for (int i = 0; i <= 5; i++) {
			list1.add((double) i);

		}
		System.out.println(list);
		System.out.println(list1);
		list.set(1, (int) 50.52);
		list.set(0, 20);
		System.out.println(list);
		

	}

}
