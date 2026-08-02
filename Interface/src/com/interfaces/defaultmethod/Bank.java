package com.interfaces.defaultmethod;

interface Rbi{
	
	void currentAccount();
	void savingAccount();
	default void rbiGoldLoan() {
		System.out.println("Rbi.rbiGoldLoan()");
	}
}

class AxisBank implements Rbi{

	@Override
	public void currentAccount() {
		System.out.println("AxisBank.currentAccount()");
	}

	@Override
	public void savingAccount() {
		System.out.println("AxisBank.savingAccount()");
	}
	
}

class SbiBank implements Rbi{

	@Override
	public void currentAccount() {
		System.out.println("SbiBank.currentAccount()");
	}

	@Override
	public void savingAccount() {
		System.out.println("SbiBank.savingAccount()");
	}
	
	@Override
	public void rbiGoldLoan() {
		System.out.println("Rbi Gold Loan");
	}
	
}


public class Bank {
   public static void main(String[] args) {
	 SbiBank user = new SbiBank();
	 user.rbiGoldLoan();
	 
}
}
