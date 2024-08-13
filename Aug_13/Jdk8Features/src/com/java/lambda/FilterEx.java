package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Teja", 99423.44));
		employList.add(new Employ(2, "Ammar", 88882.44));
		employList.add(new Employ(3, "Nagaraju", 87722.44));
		employList.add(new Employ(4, "Ashwini", 99442.44));
		employList.add(new Employ(5, "Surya", 77323.44));
		employList.add(new Employ(6, "Bhavana", 78832.44));
		employList.add(new Employ(7, "Harshitha", 78832.44));
		
		System.out.println("Basic > 90000");
		employList.stream().filter(x -> x.getBasic() >= 90000).forEach(x -> {
			System.out.println(x);
		});

		System.out.println("Name Starts with 'A'  ");
		employList.stream().filter(x -> x.getName().startsWith("A")).forEach(x -> {
			System.out.println(x);
		});
	}
}
