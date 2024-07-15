package com.java.day4;

public class EmpArray {

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
		
		Emp e4 = new Emp();
		e4.empno = 4;
		e4.name = "Hyma";
		e4.basic = 90233;
		
		Emp[] arrEmp = new Emp[] {
			e1, e2, e3, e4	
		};
		
		for (Emp emp : arrEmp) {
			System.out.println(emp);
		}
	}
}
