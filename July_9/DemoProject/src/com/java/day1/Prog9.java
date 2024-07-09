package com.java.day1;

public class Prog9 {

	public static void main(String[] args) {
		int x=12;
		int y = x++ + ++x + ++x + x++ - --x + x--;
		System.out.println(y);
	}
}
