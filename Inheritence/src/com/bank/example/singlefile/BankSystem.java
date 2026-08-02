package com.bank.example.singlefile;
class Account{
	private double balance;
	Account(double _balance){
		this.balance = _balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void showBalance() {
		System.out.println("Current Balance: "+balance);
	}
}
class SavingAccount extends Account{
	SavingAccount(double _balance){
		super(_balance);
	}
	
	public void calculateIntrest(float roi) {
		float interest;
		double tempBalance = getBalance();
		interest = (float)(tempBalance*roi)/100;
		System.out.println("Total Intrest: "+interest);
		System.out.println("Balance After 1 Year Interset: "+(tempBalance+interest));
	}
}


public class BankSystem {

	public static void main(String[] args) {
		SavingAccount user1 = new SavingAccount(70000);
		user1.showBalance();
		user1.calculateIntrest(5.02f);
		
	}

}
