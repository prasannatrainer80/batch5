package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {

	public static void main(String[] args) {
		File src = null;
		File tar = null;
		
		src = new File("C:/Batch_5/Aug_6/EmployProject/src/com/java/model/Employ.java");
		tar = new File("c:/files/EmployNew.txt");
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(tar);
			int ch;
			while((ch=fr.read()) != -1) {
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("*** File Copied ***");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
