package com.java.demo;

abstract class Flight {
	abstract void name();
	abstract void idProof();
	abstract void ticketType();
}

class Neha extends Flight {

	@Override
	void name() {
		System.out.println("Hi I am Neha...");
	}

	@Override
	void idProof() {
		System.out.println("Id Proof is Pancard");
	}

	@Override
	void ticketType() {
		System.out.println("First Class Ticket...");
	}
	
}

class Surya extends Flight {

	@Override
	void name() {
		System.out.println("Name is Surya R");
	}

	@Override
	void idProof() {
		System.out.println("Aadhar as Id Proof...");
	}

	@Override
	void ticketType() {
		System.out.println("Had Business Class Ticket...");
	}
	
}

class Pavan extends Flight {

	@Override
	void name() {
		System.out.println("Name is Pavan Kumar J");
	}

	@Override
	void idProof() {
		System.out.println("Passport as ID Proof...");
	}

	@Override
	void ticketType() {
		System.out.println("Ticket Type is Economy...");
	}
	
}

public class AbsEx1 {
	public static void main(String[] args) {
//		Flight obj1 = new Surya();
//		Flight obj2 = new Neha();
//		Flight obj3 = new Pavan();
		Flight[] arr = new Flight[] {
			new Surya(),
			new Neha(),
			new Pavan()
		};
		for (Flight flight : arr) {
			flight.name();
			flight.idProof();
			flight.ticketType();
		}
	}
}











