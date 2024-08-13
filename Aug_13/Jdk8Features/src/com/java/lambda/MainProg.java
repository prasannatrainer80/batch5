package com.java.lambda;

import java.util.Optional;
import java.util.Scanner;

public class MainProg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno;
		System.out.println("Enter Employ No    ");
		empno = sc.nextInt();
		OptionalEx2 obj2 = new OptionalEx2();
		Optional<Employ> empData = Optional.ofNullable(obj2.searchEmploy(empno));
		if (empData.isPresent()) {
			System.out.println(empData);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
