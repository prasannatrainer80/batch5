package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEx2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Nagaraju");
		names.add("Sreenivas");
		names.add("Teja");
		names.add("Bhavana");
		names.add("Ashwini");
		
		System.out.println("Names  ");
		for (String s : names) {
			System.out.println(s);
		}
		
	}
}
