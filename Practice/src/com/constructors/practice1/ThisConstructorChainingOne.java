package com.constructors.practice1;

class Amazon {
	Amazon() {
		this(2500);
	}

	Amazon(int amount) {
		this(amount, "Done");
	}

	Amazon(int amount, String message) {
		System.out.println("Payment Of " + amount + " is " + message);
	}

}

public class ThisConstructorChainingOne {
	public static void main(String[] args) {
		Amazon payment = new Amazon();
	}
}
