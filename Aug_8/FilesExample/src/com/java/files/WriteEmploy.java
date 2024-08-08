package com.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {

	public static void main(String[] args) {
		Employ employ = new Employ(1, "Sreenivasulu", 99423.44);
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/employ.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(employ);
			objout.close();
			fout.close();
			System.out.println("Objects Stored in File...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
