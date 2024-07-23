package com.java.rel;

class Fruit {
	
	String fruitName;

	public Fruit(String fruitName) {
		this.fruitName = fruitName;
	}

	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + "]";
	}
	
}

class Apple extends Fruit {

	public Apple(String fruitName) {
		super(fruitName);
		// TODO Auto-generated constructor stub
	}
	
}
class Banana extends Fruit {

	public Banana(String fruitName) {
		super(fruitName);
	}
	
}

class Mango extends Fruit {

	public Mango(String fruitName) {
		super(fruitName);
	}
	
}
public class Ex2 {
	public static void main(String[] args) {
		Fruit[] arr = new Fruit[] {
			new Mango("Mango"),
			new Banana("Banana"),
			new Apple("Apple")
		};
		
		for (Fruit fruit : arr) {
			System.out.println(fruit);
		}
	}
}
