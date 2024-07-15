package com.java.day4;

public class Quiz5 {
	
	public void show(int x) {
		System.out.println("int " +x);
	}
	
	public void show(Object x) {
		System.out.println("Object  " +x);
	}
	
	public static void main(String[] args) {
		Quiz5 obj = new Quiz5();
		obj.show(true);
	}
}
