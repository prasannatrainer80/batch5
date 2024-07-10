package com.java.day2;

public class LoopEx2 {

	public void show(int n) {
		int i=0;
		while(i < n) {
			i+=2;
			System.out.println("Even  " +i);
		}
	}
	public static void main(String[] args) {
		int n = 20;
		LoopEx2 obj = new LoopEx2();
		obj.show(n);
	}
}
