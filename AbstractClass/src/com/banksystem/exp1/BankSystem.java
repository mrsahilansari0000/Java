package com.banksystem.exp1;
abstract class Account{
	double balance;
	Account(double _balance){
		this.balance = _balance;
				
	}
	
	abstract void calulateInterest();
	
	void showBalance() {
		System.out.println("Current Balance: "+balance);
	}
	
	final void bankMessage() {
		System.out.println("Current Balance: "+balance);
	}
}

class SavingAccount extends Account{
	double interestRate = 5.0;
	SavingAccount(double _balance){
		 super(_balance);
	}
	
	@Override
	void calulateInterest() {
		double interest = (balance*interestRate)/100;
		balance = balance+interest;
		System.out.println("Interest Added: "+interest);
	}
}

class CurrentAccount extends Account{
	double interestRate = 5.0;
	CurrentAccount(double _balance){
		 super(_balance);
	}
	
	@Override
	void calulateInterest() {
		System.out.println("No Interest For Current Account");
	}
}



public class BankSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account saving = new SavingAccount(10000);
		saving.calulateInterest();
		saving.showBalance();
		
		
		Account saving1 = new CurrentAccount(20000);
		saving1.calulateInterest();
		saving1.showBalance();
		
		
	}

}
