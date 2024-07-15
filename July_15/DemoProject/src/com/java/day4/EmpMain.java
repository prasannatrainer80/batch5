package com.java.day4;

public class EmpMain {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.empno = 1;
		e1.name = "Ammar";
		e1.basic = 88323;
		
		Emp e2 = new Emp();
		e2.empno = 3;
		e2.name = "Srinivas";
		e2.basic = 88142;
		
		Emp e3 = new Emp();
		e3.empno = 4;
		e3.name = "Vinod";
		e3.basic = 88112;
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
