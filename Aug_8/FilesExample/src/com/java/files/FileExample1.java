package com.java.files;

import java.io.File;

public class FileExample1 {

	public static void main(String[] args) {
		File f1 = new File("C:/Batch_5/Aug_6/EmployProject/src/com/java/model/Employ.java");
		
		System.out.println("File Name   " +f1.getName());
		System.out.println("Full Path  " +f1.getPath());
		System.out.println("Parent Directly  " +f1.getParent());
	}
}
