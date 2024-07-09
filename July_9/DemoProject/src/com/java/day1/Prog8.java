package com.java.day1;

public class Prog8 {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		String str="sam";
		System.out.println(a+b+c+str); // 60sam
		System.out.println(a+b+str+c); //30sam30
		System.out.println(str+a+b+c); // sam102030
	}
}
