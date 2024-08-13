package com.java.lambda;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		String[] names = new String[] {
			"Padma","Hemanth","Dinesh",
			"Surya","Harshitha","Tharun",
			"Uday","Ammar"
		};
		
		Optional<String> chkNull = Optional.ofNullable(names[6]);
		if (chkNull.isPresent()) {
			System.out.println(names[6].toUpperCase());
		} else {
			System.out.println("Value is Not Present...");
		}
	}
}
