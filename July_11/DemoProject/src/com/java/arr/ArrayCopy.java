package com.java.arr;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] a = new int[] {2,55,22,67,23};
		int[] b = a;
		for (int i : b) {
			System.out.println(i);
		}
	}
}
