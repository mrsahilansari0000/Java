package com.interfaces.java;

public class AxisBank implements RbiBank {

	@Override
	public void currentAccount() {
		System.out.println("AxisBank.currentAccount()");
	}

	@Override
	public void savingAccount() {
		System.out.println("AxisBank.savingAccount()");
	}

	@Override
	public void fixedDeposit() {
		System.out.println("AxisBank.fixedDeposit()");
	}

	@Override
	public void calculateInterest() {
		System.out.println("AxisBank.calculateInterest()");
	}

}
