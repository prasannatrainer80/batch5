package com.java.arr;

public class SplitEx1 {
	public static void main(String[] args) {
		String students="Srinivas,Pavan,Dinesh,Neha,Ammar,Teja";
		String[] names = students.split(",");
		System.out.println("Student Names ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
