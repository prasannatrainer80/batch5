package com.java.day4;

public class BoxingDemo {
	public static void main(String[] args) {
		int x=12;
		double y=12.5;
		String str="Hello";
		
		Object ob1 = x;
		Object ob2 = y;
		Object ob3 = str;
		
		/* Implement Unboxing */
		int x1 = (Integer)ob1;
		double y1 = (Double)ob2;
		String s1 = (String)ob3;
		
		System.out.println("X1 value " +x1);
		System.out.println("Y1 Value  " +y1);
		System.out.println("String Value  " +s1);
		
	}
}
