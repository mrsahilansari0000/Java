package com.bank.account;
class SavingAccount implements BankAccount{

	private double balance;
	
	public SavingAccount(double balance) {
		this.balance = balance;
	}
	 
	@Override
	public void deposit(double amount) {
		if(amount>0) {
			this.balance = balance+amount;	
		}
	}

	@Override
	public void withdrawl(double amount) {
		if(amount>0 && balance >= MIN_BAL) {
			this.balance = balance-amount;
			System.out.println("Withdrwal Amount: "+amount);
			System.err.println("Current Balance: "+balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Account Balance: "+balance);
	}
	
}

class CurrentAccount implements BankAccount{
private double balance;
	
	public CurrentAccount(double balance) {
		this.balance = balance;
	}
	 
	@Override
	public void deposit(double amount) {
		if(amount>0) {
			this.balance = balance+amount;	
		}
	}

	@Override
	public void withdrawl(double amount) {
		if(amount>0 && balance >= MIN_BAL) {
			this.balance = balance-amount;
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Account Balance: "+balance);
	}
	
}


public class AxisBank {
  public static void main(String[] args) {
	  SavingAccount rahul = new SavingAccount(40000);
	  rahul.withdrawl(2000);
	  rahul.checkBalance();
}
}
