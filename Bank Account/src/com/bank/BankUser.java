package com.bank;

public class BankUser {
	public static void main(String args[]) {
		BankAccount bank = new BankAccount();
		float userInterest = bank.bankInterest();
		System.out.println("Yout Interest Is "+userInterest);
		bank.userDetails();
		bank.updateDetails("Rahul Kumar Yadav", 28, "AXI0");
		bank.userDetails();
	}
}