package com.learning.java;

import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println("The current date is " + cal.getTime());

		cal.add(Calendar.DATE, -15);

		System.out.println("The date 15 days ago is " + cal.getTime());

		cal.add(Calendar.MONTH, 4);

		System.out.println("The date 4 months later is " + cal.getTime());

		cal.add(Calendar.MONTH, -4);

		System.out.println("The date 4 months ago is " + cal.getTime());

		cal.add(Calendar.YEAR, 2);

		System.out.println("The date after 2 years is " + cal.getTime());

		cal.add(Calendar.YEAR, -2);

		System.out.println("The date before 2 years is " + cal.getTime());

		System.out.println("The current year is " + cal.get(Calendar.YEAR));

		System.out.println("The current month is " + cal.get(Calendar.MONTH));

		System.out.println("The current DATE is " + cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		
		System.out.println(days(Calendar.DAY_OF_WEEK, 1));

	}

}
