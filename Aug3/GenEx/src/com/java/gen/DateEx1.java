package com.java.gen;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
	}
}
