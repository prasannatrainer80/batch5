package com.java.day4;

public class Quiz4 {
	
	public void show(int x) {
		System.out.println("Integer  " +x);
	}
	
	public void show(Object x) {
		System.out.println("Object " +x);
	}
	
	public static void main(String[] args) {
		char ch='A';
		Quiz4 obj = new Quiz4();
		obj.show(ch);
	}
}
