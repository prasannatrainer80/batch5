package com.java.day1;

public class Voting {

	public void check(int age) {
		if (age >= 18) {
			System.out.println("You are Elligible for Voting...");
		} else {
			System.out.println("You Cannot Vote...");
		}
	}
	public static void main(String[] args) {
		int age=25;
		Voting obj = new Voting();
		obj.check(age);
	}
}
