package com.java.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInEx {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("c:/files/data1.txt");
			DataInputStream din = new DataInputStream(fin);
			int x = din.readInt();
			String str = din.readUTF();
			double bas = din.readDouble();
			boolean flag = din.readBoolean();
			System.out.println("X  " +x);
			System.out.println("Name   " +str);
			System.out.println("Salary  " +bas);
			System.out.println("Boolean  " +flag);
			din.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
