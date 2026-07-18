package com.abstractsclass.exp1;

public class CurrentAccount extends Account {

	CurrentAccount(double balance) {
		super(balance);
	}

	@Override
	void calculateInterest() {
		System.out.println("No interest for Current Account");
	}
       
}
