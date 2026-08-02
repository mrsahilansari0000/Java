package com.bank.example;

public class Account {
     private double balance;
     public double _tempBalance;
       
     public double verification() {
    	 return balance;
     }
     
     public Account(double _balance) {
    	 this.balance = _balance;
    	 this._tempBalance = balance;
    			 
     }
     
     public void showBalance() {
    	 System.out.println("User Current Balance "+balance);
     }
}
