package com.marker.interfaces1;

public class BankAccount implements Cloneable {
	private int balance;
	String accountHolder;
	public BankAccount(int balance, String accountHolder) {
		this.balance = balance;
		this.accountHolder = accountHolder;
	}
	
	public void getBalance() {
		System.out.println(accountHolder+" Current Bank Balance: "+balance);
	}
	
	@Override
	public BankAccount clone() throws CloneNotSupportedException {
	    return (BankAccount) super.clone(); // Object class clone
	}
	
   public static void main(String[] args) throws CloneNotSupportedException {
        BankAccount user1 = new BankAccount(20000, "Sumit");
        BankAccount user2 =  (BankAccount) user1.clone(); // Copy Object
        BankAccount user3 = new BankAccount(30000, "Rahul");
        user1.getBalance();
        user2.getBalance();
        user3.getBalance();
    }
}
