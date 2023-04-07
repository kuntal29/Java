package com.learning.java;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\kuntal-pc\\Desktop\\java.txt");
		boolean result;

		try {
			result = file.createNewFile();
			if (result) {
				System.out.println("File created successfully");
			} else {
				System.out.println("File creation failed");
			}
		} catch (IOException  e) {
			e.printStackTrace();
		}

	}
}
