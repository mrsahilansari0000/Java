package com.abstractsclass.exp1;

public abstract class Account {
	double balance;

	Account(double balance) {
		this.balance = balance;
	}

	abstract void calculateInterest();

	void showBalance() {
		System.out.println("Current Balance: " + balance);
	}
}
