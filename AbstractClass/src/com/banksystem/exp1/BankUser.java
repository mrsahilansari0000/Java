package com.banksystem.exp1;
abstract class RbiBank{
	abstract void calculateInterest();
	abstract void homeLoanInterest();
	abstract void goldLoanInterest();	
}

class AxisBank extends RbiBank{
	void calculateInterest() {
		System.out.println("AxisBank.calculateInterest()");
	}
	void homeLoanInterest() {
		System.out.println("AxisBank.homeLoanInterest()");
	}
	
	
	void goldLoanInterest() {
		System.out.println("AxisBank.goldLoanInterest()");
	}
}
public class BankUser {
public static void main(String[] args) {
	RbiBank rbi = new AxisBank();
	rbi.calculateInterest();
}
}
