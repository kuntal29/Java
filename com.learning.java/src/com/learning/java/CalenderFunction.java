package com.learning.java;

import java.time.LocalDate;
import java.util.Calendar;

public class CalenderFunction {

	

	public static String finday(int month, int day, int year) {
		{
	        LocalDate dt = LocalDate.of(year,month,day);
	        return (dt.getDayOfWeek().toString());
	        
	    }

	}
	
	public static void main (String args[]) {
		
		System.out.println(finday(12, 12, 2017));
		
		
	}
//test
}
