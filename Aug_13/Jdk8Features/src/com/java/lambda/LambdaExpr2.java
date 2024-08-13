package com.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpr2 {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Teja", 99423.44));
		employList.add(new Employ(2, "Ammar", 88882.44));
		employList.add(new Employ(3, "Nagaraju", 87722.44));
		employList.add(new Employ(4, "Ashwini", 99442.44));
		employList.add(new Employ(5, "Surya", 77323.44));
		employList.add(new Employ(6, "Bhavana", 78832.44));
		employList.add(new Employ(7, "Harshitha", 78832.44));
		
		System.out.println("Employ List is  ");
		employList.forEach(x -> {
			System.out.println(x);
		});
		
		Collections.sort(employList ,(e1, e2) -> {
			return (int) e1.getName().compareTo(e2.getName());
		});
		
		System.out.println("Sorted Data  ");
		employList.forEach(x -> {
			System.out.println(x);
		});
		
		Collections.sort(employList, (e1, e2) -> {
			return (int) ((int) e1.getBasic() - e2.getBasic());
		});
		
		System.out.println("Sort By Basic Wise   ");
		employList.forEach(x -> {
			System.out.println(x);
		});
	}
}
