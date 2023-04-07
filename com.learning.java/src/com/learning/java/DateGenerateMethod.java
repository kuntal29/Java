package com.learning.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateGenerateMethod {
	
	public static String dateGenerate () {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = formatter.format(date);
		return strDate;
				
	}



	public static void main(String[] args) {
		System.out.println(dateGenerate());

	}

}
