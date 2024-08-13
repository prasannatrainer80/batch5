package com.java.lambda;

interface IHello {
	void greeting();
}

public class LambdaExpression1 {
	
	public static void main(String[] args) {
		IHello obj1 = () -> {
			System.out.println("Good Morning...");
		};
		
		obj1.greeting();
		
		IHello obj2 = () -> {
			System.out.println("From Java 5 batch...");
		};
		
		obj2.greeting();
	}
}
