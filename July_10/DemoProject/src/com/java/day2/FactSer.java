package com.java.day2;

public class FactSer {

	public void show(int n) {
		int f = 1;
		for(int i=1;i<=n;i++) {
			f = f * i;
			System.out.println("Factorial Value  " +f);
		}
	}
	public static void main(String[] args) {
		int n = 8;
		FactSer obj = new FactSer();
		obj.show(n);
	}
}
