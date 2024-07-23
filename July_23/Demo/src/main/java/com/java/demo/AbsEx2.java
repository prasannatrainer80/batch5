package com.java.demo;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Padma extends Training {

	@Override
	void name() {
		System.out.println("Name is Padma...");
	}

	@Override
	void email() {
		System.out.println("Email is padma@gmail.com");
	}
	
}

class Srinivas extends Training {

	@Override
	void name() {
		System.out.println("Name is Srinivas...");
	}

	@Override
	void email() {
		System.out.println("Email is srini@gmail.com");
	}
	
}

class Naga extends Training {

	@Override
	void name() {
		System.out.println("Name is Nagaraju...");
	}

	@Override
	void email() {
		System.out.println("Email is naga@gmail.com");
	}
}

public class AbsEx2 {
	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Naga(), new Padma(), new Srinivas()	
		};
		for (Training training : arr) {
			training.name();
			training.email();
		}
	}
}
