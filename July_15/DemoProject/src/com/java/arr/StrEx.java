package com.java.arr;

public class StrEx {
	public static void main(String[] args) {
		String str = "Welcome to Java Programming...Trainer Prasanna...";
		System.out.println("Length of String  " +str.length());
		System.out.println("Char at 5th position  "+str.charAt(5));
		System.out.println("First occurrence of char 'o' is  " +str.indexOf("o"));
		System.out.println("Lower Case String is " +str.toLowerCase());
		System.out.println("Upper Case String is " +str.toUpperCase());
		String s1="Teja", s2="Ashwini", s3="Teja";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println("Substring is  " +str.substring(10, 20));
	}
}
