package com.learning.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatString2Date {

	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("dd/MMMM/yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("hh.mm.aa");

		try {
			Date date = format.parse("16/MAR/2023");
			System.out.println("Date is : " + date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Date date1 = new Date();
		System.out.println(date1);
		String date2 = format1.format(date1);
		System.out.println(date2);
		

	}

}
