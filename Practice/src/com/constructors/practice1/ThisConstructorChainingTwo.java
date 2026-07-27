package com.constructors.practice1;

class Flipkart {
	Flipkart() {
		System.out.println("Connecting To Server");
	}

	Flipkart(int amount) {
		this();
		System.out.println("Payment Under Processing.....");
	}

	Flipkart(int amount, String message) {
		this(amount);
		System.out.println("Done");
	}

}

public class ThisConstructorChainingTwo {
	public static void main(String[] args) {
		Flipkart flip = new Flipkart(2500, "Done");
	}
}
