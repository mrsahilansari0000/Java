package com.interfaces.java;

public class BankOfBaroda implements RbiBank{

	@Override
	public void currentAccount() {
		System.out.println("BankOfBaroda.currentAccount()");
	}

	@Override
	public void savingAccount() {
		System.out.println("BankOfBaroda.savingAccount()");
	}

	@Override
	public void fixedDeposit() {
		System.out.println("BankOfBaroda.fixedDeposit()");
	}

	@Override
	public void calculateInterest() {
		System.out.println("BankOfBaroda.calculateInterest()");
	}

}
