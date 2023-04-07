package com.learning.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CollectionsFunctions {

	public static void main(String[] args) {
		List<Integer> intArr = new ArrayList<Integer>();

		int[] k = { 2, 10, 50, 8, 4, 9 };

		intArr.add(10);
		intArr.add(5);
		intArr.add(20);
		intArr.add(40);
		System.out.println(intArr);
		System.out.println(Collections.max(intArr));
		System.out.println(Collections.min(intArr));
		Collections.reverse(intArr);
		System.out.println(intArr);
		Arrays.sort(k);
		System.out.println(Arrays.toString(k)); /// elements are sorted but to print array need to use toString
		int max = Collections.max(intArr);
		int min = Collections.min(intArr);
		if (max == min) {
			System.out.println("All elements are equal");
		} else {
			System.out.println(
					"All elements are not equal" + " " + "Mini element is : " + min + "  " + "MAx element is : " + max);
		}
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);

		}
		System.out.println(list);
		System.out.println(list.size());
		Collections.shuffle(list);
		System.out.println(list);
		Collections.shuffle(list, new Random());
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		if (list.size() > 10) {
			System.out.println("Array size is greater");
		} else {
			System.out.println("Size is less");
		}
		System.out.println(list.size() > 10);
	}

}
