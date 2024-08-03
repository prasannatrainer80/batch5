package com.java.gen;

import java.util.Calendar;

public class CalEx1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.DATE,2);
		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH,5);
		System.out.println(cal.getTime());
		cal.add(Calendar.YEAR, 5);
		System.out.println(cal.getTime());
	}
}
