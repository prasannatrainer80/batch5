package com.java.rel;

class Student {
	String sname;

	public Student(String sname) {
		super();
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + "]";
	}
	
}

class Yegna extends Student {

	String trainer;
	public Yegna(String sname, String trainer) {
		super(sname);
		this.trainer = trainer;
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		System.out.println("Trainer is  " +trainer);
	}
	
}

class Vineetha extends Student {

	String trainer;
	public Vineetha(String sname,String trainer) {
		super(sname);
		this.trainer = trainer;
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		System.out.println("Trainer is  " +trainer);
	}
	
}
class Vinod extends Student {

	String trainer;
	public Vinod(String sname, String trainer) {
		super(sname);
		this.trainer = trainer;
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		System.out.println("Trainer is  " +trainer);
	}
	
	
}

public class Ex1 {
	public static void main(String[] args) {
		Vinod vinod = new Vinod("Vinod", "Prasanna");
		Vineetha vineetha = new Vineetha("Vineetha", "Narayana");
		Yegna yegna = new Yegna("Yegna Jayasimha", "Prasanna");
		
		Student[] arr = new Student[] {vinod, vineetha, yegna};
		for (Student student : arr) {
			System.out.println(student);
			
		}
	}
}
