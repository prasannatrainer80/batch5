package com.lms.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.lms.bal.LeaveDetailsBal;
import com.lms.ex.LeaveDetailsException;
import com.lms.model.LeaveDetails;
import com.lms.model.LeaveType;

public class LeaveDetailsMain {

	static Scanner sc = new Scanner(System.in);
	
	static LeaveDetailsBal bal  = new LeaveDetailsBal();
	public static void addLeaveMain() throws ParseException, LeaveDetailsException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails ld = new LeaveDetails();
		System.out.println("Enter Employ Id  ");
		ld.setEmpId(sc.nextInt());
		System.out.println("Enter Leave Start Date (yyyy-MM-dd)  ");
		ld.setLeaveStartDate(sdf.parse(sc.next()));
		System.out.println("Enter Leave End Date (yyyy-MM-dd)   ");
		ld.setLeaveEndDate(sdf.parse(sc.next()));
		System.out.println("Enter Leave Type (EL/PL/ML )   ");
		ld.setLeaveType(LeaveType.valueOf(sc.next()));
		System.out.println("Enter Leave Reason  ");
		ld.setLeaveReason(sc.next());
		System.out.println(bal.addLeaveBal(ld));
	}
	
	public static void showLeaveMain() {
		List<LeaveDetails> ld = bal.showLeaveDetailsBal();
		for (LeaveDetails leaveDetails : ld) {
			System.out.println(leaveDetails);
		}
	}
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S ");
			System.out.println("--------------");
			System.out.println("1. Add Leave  ");
			System.out.println("2. Show Leave");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					addLeaveMain();
				} catch (ParseException | LeaveDetailsException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2 : 
				showLeaveMain();
				break;
			}
		} while(choice!=8);
	}
}
