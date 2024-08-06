package com.java.main;

import java.util.List;
import java.util.Scanner;

import com.java.bal.EmployBal;
import com.java.exception.EmployException;
import com.java.model.Employ;
import com.java.model.Gender;

public class EmployMain {

	static Scanner sc = new Scanner(System.in);
	
	static EmployBal bal = new EmployBal();
	
	
	public static void showEmployMain() {
		List<Employ> employList = bal.showEmployBal();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
	public static void addEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("Enter Employ No   ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name   ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		System.out.println(bal.addEmployBal(employ));
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			
			System.out.println("O P T I O N S");
			System.out.println("-------------");
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Search Employ");
			System.out.println("4. Update Employ");
			System.out.println("5. Delete Employ");
			System.out.println("6. Exit");
			System.out.println("Enter Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					addEmployMain();
				} catch (EmployException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2 : 
				showEmployMain();
				break;
			case 6 : 
					return;
			}
		} while(choice!=6);
	}
}
