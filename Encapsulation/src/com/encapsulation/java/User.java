package com.encapsulation.java;

class Atm{
	private double balance = 25000;
	int pin =12345;
	public void deposit(double depostiAmount, int _pin) {
		if(depostiAmount>0 && _pin==pin) {
			balance = balance+depostiAmount;
			System.out.println("Deposit Amount: "+depostiAmount+" "+"Your Current Balance: "+balance);
		}
	}
	
    public void withdrawl(double withdrawlAmount , int _pin) {
    	if(withdrawlAmount<=balance && _pin==pin) {
			balance = balance-withdrawlAmount;
			System.out.println("Withdrawl Amount: "+withdrawlAmount+" "+"Your Current Balance: "+balance);
		}
	}
    
    public void getBalance() {
		System.out.println("Your Current Balance: "+balance);
	}
}



public class User {

	public static void main(String[] args) {
	  Atm user1 = new Atm();
	  user1.deposit(25000, 12345);
	  user1.withdrawl(25000, 12345);
	  user1.getBalance();

	}

}
