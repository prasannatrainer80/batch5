package com.java.day4;

public class Quiz2 {

	public void show(long x) {
		System.out.println("Long " +x);
	}
	
	public void show(Object x) {
		System.out.println("Object  " +x);
	}
	
	public static void main(String[] args) {
		Quiz2 obj = new Quiz2();
		obj.show(12);
	}
}
