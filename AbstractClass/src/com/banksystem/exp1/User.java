package com.banksystem.exp1;
abstract class Bank{
	public void showMessage(){
		System.out.println("Bank.showMessage()");
	}
	
	public void main() {
		System.out.println("Main");
	}
	
	public static void testData() {
		System.out.println("Bank.testData()");
	}
	
}

class AxisBanks extends Bank{
	public void showMessage() {
		System.out.println("Bank.showMessage().........");
	}
	
	public static void testData() {
		System.out.println("Bank.testData()......");
	}
}

public class User {
public static void main(String[] args) {
	AxisBanks axis = new AxisBanks();
	Bank bank = new AxisBanks();
	axis.testData();
	bank.testData();
}
}
