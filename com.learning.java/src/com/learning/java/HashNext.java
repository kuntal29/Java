package com.learning.java;

import java.util.ArrayList;
import java.util.Iterator;

public class HashNext {

	public static void main(String args[]) {

		ArrayList<Integer> intArr = new ArrayList<Integer>();

		intArr.add(20);
		intArr.add(30);
		intArr.add(50);
		System.out.println(intArr);

		try {
			System.out.println(intArr.hashCode());

			Iterator<Integer> itr = intArr.iterator();

			System.out.println(itr.hasNext());
			System.out.println(itr.next() > 30);
			System.out.println(itr.hasNext());
			itr.next();
			System.out.println(itr.hasNext());
			itr.next();
			System.out.println(itr.hasNext());
			itr.next();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
