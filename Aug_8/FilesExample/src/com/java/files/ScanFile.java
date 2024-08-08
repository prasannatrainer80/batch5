package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {

	public static void main(String[] args) {
		File f1 = new File("C:/Batch_5/Aug_6/EmployProject/src/com/java/model/Employ.java");
		Scanner sc=null;
		try {
			sc=new Scanner(f1);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		
	}
}
