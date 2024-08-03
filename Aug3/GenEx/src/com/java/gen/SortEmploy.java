package com.java.gen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		Comparator<Employ> c = new NameComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		employList.add(new Employ(1, "Sreenivas", "Male", "Java", "Programmer", 88423.44));
		employList.add(new Employ(2, "Nagaraju", "Male", "Dotnet", "Expert", 90032.44));
		employList.add(new Employ(3, "Hyma", "Female", "Java", "TL", 98832.44));
		employList.add(new Employ(4, "Aishwarya", "Female", "Angular", "Programmer", 99244.44));
		employList.add(new Employ(5, "Bhavana", "Female", "React", "Programmer", 98832.44));
		employList.add(new Employ(6, "Bhaveen", "Male", "MiddleWare", "TSE", 99111.44));
		
		System.out.println("Employ List  ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
