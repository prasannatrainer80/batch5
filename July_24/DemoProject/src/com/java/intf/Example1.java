package com.java.intf;

interface ITraining {
	void name();
	void email();
}

class Ammar implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Ammar...");
	}

	@Override
	public void email() {
		System.out.println("Email is ammar@gmail.com");
	}
	
}

class Pavan implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Pavan...");
	}

	@Override
	public void email() {
		System.out.println("Email is pavan@gmail.com");
	}
	
}

class Srinivas implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Srinivas...");
	}

	@Override
	public void email() {
		System.out.println("Email is srini@gmail.com");
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Srinivas(), new Ammar(),new Pavan()	
		};
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
