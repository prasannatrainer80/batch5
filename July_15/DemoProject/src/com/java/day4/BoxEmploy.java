package com.java.day4;

public class BoxEmploy {

	public void show(Object ob) {
	//	int x = (Integer)ob;
		Employ x = (Employ)ob;
		System.out.println("Employ No  " +x.empno);
		System.out.println("Employ Name  " +x.name);
		System.out.println("Basic  " +x.basic);
	}
	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.empno = 1;
		employ.name = "Ammar";
		employ.basic = 88323.44;
		
		BoxEmploy obj = new BoxEmploy();
		obj.show(employ);
	}
}
