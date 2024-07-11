package com.java.arr;

public class Quiz {
	public static void main(String[] args) {
		int[] a= new int[] {3,66,21,35};
		int[] b = a;
		b[2]=62;
		System.out.println(a[2] + " " +b[2]);
	}
}
