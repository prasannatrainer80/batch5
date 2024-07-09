package com.java.day1;

/**
 * Program to Convert celcius to kelvin
 */
public class CtoK {

	public void calc(double c) {
		double k = c + 273;
		System.out.println("Kelvin Value  " +k);
	}
	public static void main(String[] args) {
		double c = 53;
		CtoK obj = new CtoK();
		obj.calc(c);
	}
}
