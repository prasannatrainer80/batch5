package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoopEx1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Sreenivasulu");
		names.add("Bhaveen");
		names.add("Hemanth");
		names.add("Ammar");
		names.add("Teja");
		names.add("Uday");
		
		System.out.println("Names are  ");
		names.forEach(x -> {
			System.out.println(x);
		});
	}
}
