package com.abstractsclass.exp1;

public class BankUser {

	public static void main(String[] args) {
		Account user = new SavingAccount(25000);
		user.calculateInterest();
		user.showBalance();

	}

}
