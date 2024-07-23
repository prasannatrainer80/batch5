package com.java.demo;

abstract class Employ {
	
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Vinod extends Employ {
	public Vinod(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
}

public class AbsCon {
	public static void main(String[] args) {
		Employ employ1 = new Vinod(1, "Vinod", 58823.44);
		System.out.println(employ1);
	}
}
