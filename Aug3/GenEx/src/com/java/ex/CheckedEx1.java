package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckedEx1 {

	public void convert(String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		System.out.println(date);
	}
	public static void main(String[] args) {
		String sr = "2024-08-03";
		CheckedEx1 obj = new CheckedEx1();
		try {
			obj.convert(sr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
