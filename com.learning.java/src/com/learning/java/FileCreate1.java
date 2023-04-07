package com.learning.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreate1 {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\kuntal-pc\\Desktop\\javalearntest.txt");

		try {
			Path p = Files.createFile(path);
			System.out.println("File created at path " + p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File file = new File("C:\\Users\\kuntal-pc\\Desktop\\javalearntest.txt");
		File renameFile = new File ("C:\\\\Users\\\\kuntal-pc\\\\Desktop\\\\javalearn1.txt");
		if (file.renameTo(renameFile)) {
			System.out.println("File renamed successfully");
		}
		else {
			System.out.println("File not renamed successfully");
		}
	}

}
