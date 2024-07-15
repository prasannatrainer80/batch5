package com.java.day4;

public class Enum1 {
	public static void main(String[] args) {
		WeekDays wd1 = WeekDays.MONDAY;
		System.out.println(wd1);
		String str = "FRIDAY";
		WeekDays wd2 = WeekDays.valueOf(str);
		System.out.println(wd2);
	}
}
