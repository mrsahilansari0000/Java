package com.encapsulation.exp;

class Bank {
	private String accountNumber;
	private String accountHolder;
	private double balance;
	private static double roi = 4.02;

	public Bank(String accountNo, String accountHolder, double balance) {
		this.accountNumber = accountNo;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getRoi() {
		return roi;
	}

	public static void setRoi(double roi) {
		Bank.roi = roi;
	}
	
	public void calculateInterest() {
		double interest = (balance*roi)/100;
		balance = balance+interest;
	}

	public void getAccountDetails() {
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder : "+accountHolder);
		System.out.println("Balance : "+balance);
	}
}

public class BankAccount {
	public static void main(String[] args) {
		Bank bank = new Bank("748596415247859", "Mukesh", 2500);
		bank.calculateInterest();
		bank.getAccountDetails();
	}
}
