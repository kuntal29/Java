package com.learning.java;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileWrtie {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter file name");
			String fileName = sc.nextLine();

			FileOutputStream fout = new FileOutputStream(fileName, true);
			System.out.println("Enter the content to be printed on file");
			String content = sc.nextLine() + "\n";
			byte[] b = content.getBytes();

			fout.write(b);
			fout.close();
			System.out.println("File saved successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
