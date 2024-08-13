package com.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OptionalEx2 {
	static List<Employ> employList = new ArrayList<Employ>();
	static {
		employList.add(new Employ(1, "Teja", 99423.44));
		employList.add(new Employ(2, "Ammar", 88882.44));
		employList.add(new Employ(3, "Nagaraju", 87722.44));
		employList.add(new Employ(4, "Ashwini", 99442.44));
		employList.add(new Employ(5, "Surya", 77323.44));
		employList.add(new Employ(6, "Bhavana", 78832.44));
		employList.add(new Employ(7, "Harshitha", 78832.44));
	}
	
	public List<Employ> showEmploy() {
		return employList;
	}
	
	public Employ searchEmploy(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno() == empno) {
				employFound = employ;
			}
		}
		return employFound;
	}
	
	
}
