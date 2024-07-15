package com.java.day4;

public class Quiz3 {

	public void show(double x) {
		System.out.println("Double " +x);
	}
	
	public void show(long x) {
		System.out.println("Long  " +x);
	}
	
	public void show(Object x) {
		System.out.println("Object  " +x);
	}
	
	public static void main(String[] args) {
		Quiz3 obj = new Quiz3();
		obj.show(12);
	}
}
