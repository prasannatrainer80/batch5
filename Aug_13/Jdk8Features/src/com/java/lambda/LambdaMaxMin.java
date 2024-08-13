package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaMaxMin {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Teja", 99423.44));
		employList.add(new Employ(2, "Ammar", 88882.44));
		employList.add(new Employ(3, "Nagaraju", 87722.44));
		employList.add(new Employ(4, "Ashwini", 99442.44));
		employList.add(new Employ(5, "Surya", 77323.44));
		employList.add(new Employ(6, "Bhavana", 78832.44));
		employList.add(new Employ(7, "Harshitha", 78832.44));

		Employ maxEmploy = employList.stream().max((m1,m2) -> 
			m1.getBasic() > m2.getBasic() ? 1 : -1).get();
		System.out.println(maxEmploy);
		
		Employ minEmploy = employList.stream().min((m1, m2) -> 
			m1.getBasic() > m2.getBasic() ? 1 : -1).get();
		System.out.println(minEmploy);
	}
}
