package com.java.arr;

public class CourseList {

	public static void main(String[] args) {
		String couresList="HTML CSS3 Javascript Jquery Java Jdbc";
		String[] courses = couresList.split(" ");
		System.out.println("Courses are ");
		for (String s : courses) {
			System.out.println(s);
		}
	}
}
