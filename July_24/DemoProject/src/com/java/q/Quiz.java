package com.java.q;

interface IOne {
	default void show() {
		System.out.println("Show from IOne...");
	}
}

interface ITwo {
	default void show() {
		System.out.println("Show from ITwo...");
	}
}

interface IThree {
	default void show() {
		System.out.println("Show from IThree...");
	}
}

class Test implements IOne, ITwo, IThree {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		IOne.super.show();
		ITwo.super.show();
		IThree.super.show();
	}
	
}

public class Quiz {

	public static void main(String[] args) {
		Test test = new Test();
		test.show();
	}
}
