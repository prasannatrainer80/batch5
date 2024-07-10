package com.java.day2;

/**
 * Program to Print Odd Numbers of given range
 */

public class LoopEx3 {

	public void show(int n) {
		int i=1;
		while(i < n) {
			System.out.println("Odd  " +i);
			i+=2;
		}
	}
	public static void main(String[] args) {
		int n = 20;
		LoopEx3 obj = new LoopEx3();
		obj.show(n);
	}
}
