package com.java.gen;

class Data<T> {
	
	public void swap(T a, T b) {
		T t = a;
		a = b;
		b = t;
		System.out.println("A value " +a+ " B value " +b);
	}
}

public class GenEx1 {

	public static void main(String[] args) {
		
		Employ employ1 = new Employ(1, "Pavan", "Male", "Java", "Programmer", 84823);
		Employ employ2 = new Employ(2, "Nagaraju", "Male", "Dotnet", "Manager", 99992);
		Data<Integer> data1 = new Data<Integer>();
		int a=6, b = 8;
		data1.swap(a, b);
		
		Data<String> data2 = new Data<String>();
		String s1="Ammar", s2="Nagaraju";
		data2.swap(s1, s2);
		
		Data<Double> data3 = new Data<Double>();
		double a1 = 423.5, a2=5.23;
		data3.swap(a1, a2);
		
		Data<Employ> data4 = new Data<Employ>();
		data4.swap(employ1, employ2);
	}
}
