package com.learning.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputUsingBuffer {

	public static void main(String[] args) throws Exception

	{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		String name = reader.readLine();
		System.out.println("String is " +  name);
		

	}

}
