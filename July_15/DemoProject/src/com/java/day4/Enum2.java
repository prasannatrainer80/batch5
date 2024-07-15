package com.java.day4;

public class Enum2 {

	public static void main(String[] args) {
		OrderStatus ordStatus = OrderStatus.PENDING;
		System.out.println(ordStatus);
		String status = "ACCEPTED";
		OrderStatus st = OrderStatus.valueOf(status);
		System.out.println(st);
	}
}
