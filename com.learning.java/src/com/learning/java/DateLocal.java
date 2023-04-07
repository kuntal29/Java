package com.learning.java;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateLocal {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(date + ":" + time);

	}

}
