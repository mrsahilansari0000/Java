package com.axis.bank;

public class AxisBank {
    private double balance = 50000;
    private String userId = "kodewala@axis";
    private String userPass = "kode@123";
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
    
	public void deposit(int deposit) {
		this.balance = balance+deposit;
	}
	
	public void withDrawl(int amount) {
		this.balance = balance-amount;
	}
    
}
