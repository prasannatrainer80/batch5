package com.java.day2;

public class LoopEx1 {

	public void show() {
		int i = 0;
		int count = 10;
		while(i < count) {
			System.out.println("Welcome to Java 5");
			i++;
		}
	}
	public static void main(String[] args) {
		LoopEx1 obj = new LoopEx1();
		obj.show();
	}
}
