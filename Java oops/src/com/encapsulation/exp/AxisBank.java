package com.encapsulation.exp;

public class AxisBank {
	 private int balance = 25000;
     
	 public void setBalance(int _balance) {
		 if(_balance>0) {
			 this.balance = balance+_balance;
		 }
		 else {
			 System.out.println("Invalid Amount Please Check Again");
		 }
	 }
	 
	 public int getBalance() {
			return balance;
		}

	 public static void main(String[] args) {
		
	}
}
