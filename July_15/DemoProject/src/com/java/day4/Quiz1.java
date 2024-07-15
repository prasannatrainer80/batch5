package com.java.day4;

public class Quiz1 {

	public void show(double x) {
		System.out.println("Double  " +x);
	}
	
	public void show(Object x) {
		System.out.println("Object  " +x);
	}
	
	public static void main(String[] args) {
		Quiz1 obj = new Quiz1();
		obj.show(12);
	}
}
