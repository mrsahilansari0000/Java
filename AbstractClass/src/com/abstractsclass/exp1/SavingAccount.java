package com.abstractsclass.exp1;

public class SavingAccount extends Account {

	double rateOfInterest = 5.2;
	
	SavingAccount(double balance) {
		super(balance);
	}

	@Override
	void calculateInterest() {
		double interest = (balance*rateOfInterest)/100;
		balance = balance+interest;
		System.out.println("Total Interest: "+interest);
	}

}
