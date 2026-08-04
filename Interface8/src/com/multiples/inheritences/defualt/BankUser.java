package com.multiples.inheritences.defualt;


class AxisBank implements Rbi, BankAccount{

	@Override
	public void currentAccount() {
		BankAccount.super.currentAccount();
		//Rbi.super.currentAccount();
	}
	
	
}
public class BankUser {
     public static void main(String[] args) {
    	 AxisBank user = new AxisBank();
    	 user.currentAccount();
	}
}
