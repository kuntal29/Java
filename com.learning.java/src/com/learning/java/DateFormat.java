package com.learning.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String strDate1 = formatter.format(date);
		System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate1);  
		
		formatter = new SimpleDateFormat("dd MMMM yyyy");
		String strDate2 = formatter.format(date);
		System.out.println("Date Format with dd MMMM yyyy : " +strDate2);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy");
		String strDate3 = formatter.format(date);
		System.out.println("Date Format with dd MMMM yyyy zzzz : " +strDate3);
		
	    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
	    String strDate4 = formatter.format(date);  
	    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : " + strDate4); 

	}

}
