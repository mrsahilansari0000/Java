package com.random.practice;
class BankAccount{
	private double bankBalance;

	public BankAccount(double bankBalance) {
		super();
		this.bankBalance = bankBalance;
	}

	
	public void depositAmount(int amount) {
		if(amount>0) {
			this.bankBalance = bankBalance+amount;
			System.out.println("Deposit Amount: "+amount);
		}
	}
	
	public void showCurrentBalance() {
		System.out.println("Your Bank Balance: "+bankBalance);
	}
	
	public void withDrawlAmount(double withDrawlAmount) {
		if(withDrawlAmount>0 && withDrawlAmount<=bankBalance)
		{
			bankBalance=bankBalance-withDrawlAmount;
		    System.out.println("You Withdraw: "+withDrawlAmount);
		}
	}
	
}

public class BankUser {
  public static void main(String[] args) {
	  BankAccount rahul = new BankAccount(100000);
	  rahul.showCurrentBalance();
	  rahul.withDrawlAmount(25000);
	  rahul.showCurrentBalance();
	  rahul.depositAmount(50000);
	  rahul.showCurrentBalance();
   }
}
