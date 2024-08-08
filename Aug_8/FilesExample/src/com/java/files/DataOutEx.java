package com.java.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataOutEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/data1.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(52);
			dout.writeUTF("Vinod Kumar");
			dout.writeDouble(84823.44);
			dout.writeBoolean(true);
			dout.close();
			fout.close();
			System.out.println("*** File Created ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
