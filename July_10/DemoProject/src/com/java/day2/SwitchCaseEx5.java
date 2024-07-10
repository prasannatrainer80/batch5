package com.java.day2;

public class SwitchCaseEx5 {

	public void show(int year, int month) {
		switch(month) {
		case 1,3,5,7,8,10,12 -> System.out.println("Month Has  31 Days...");
		case 4,6,9,11 -> System.out.println("Month has 30 Days");
		case 2 -> {
			if (year%4==0) {
				System.out.println("Its Leap Year you have 29 days...");
			} else {
				System.out.println("Its Not Leap Year it has 28 Days only...");
			}
		}
		default -> System.out.println("Invalid Month...");
		}
	}
	public static void main(String[] args) {
		SwitchCaseEx5 obj = new SwitchCaseEx5();
		obj.show(2020, 2);
	}
}
