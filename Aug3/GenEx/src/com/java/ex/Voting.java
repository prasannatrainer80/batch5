package com.java.ex;

import java.util.Scanner;

public class Voting {

	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You are Not Elligible for Voting...");
		} 
		System.out.println("You Can Elligible for Voting...");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter Age   ");
		age = sc.nextInt();
		Voting voting = new Voting();
		try {
			voting.check(age);
		} catch (VotingException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
}
