package com.constructors.practice1;

class Payment {
	public Payment() throws InterruptedException {
		System.out.println("Payment Under Processing....");
	}

	public Payment(int amount) throws InterruptedException {
		this();
		Thread.sleep(5000);
		System.out.println("Connecting To Server....");

	}
}

class Account extends Payment {
	public Account(int amount) throws InterruptedException {
		this(amount, 1);
	}

	public Account(int amount, int token) throws InterruptedException {
		super(amount);
		Thread.sleep(3000);
		System.err.println("Paymet Of " + amount + " is " + " Done");
	}
}

public class SuperConstructorChainingOne {
	public static void main(String[] args) throws InterruptedException {
		Account user1 = new Account(30000);
		// System.out.println(Thread.currentThread().getName());
	}
}
