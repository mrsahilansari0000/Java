package com.polymorphisms.basics.examples;

class Account{
	public void getMessage() {
		System.out.println("Account.getMessage()");
	}
}

class SavingAccount extends Account{
	public void getMessage() {
		System.out.println("SavingAccount.getMessage()");
	}
}

class CurrentAccount extends Account{
	public void getMessage() {
		System.out.println("CurrentAccount.getMessage()");
	}
}

public class Driver {
     public static void main(String[] args) {
		 Account parRef = new SavingAccount();
		 parRef.getMessage();
	}
}
