package com.java.intf;

interface IOne {
	void name();
}

interface ITwo {
	void email();
}

class Rajitha implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is rajitha@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Rajitha...");
	}
	
}

public class MultiInh {

	public static void main(String[] args) {
		Rajitha obj = new Rajitha();
		obj.name();
		obj.email();
	}
}
