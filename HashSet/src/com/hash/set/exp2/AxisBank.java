package com.hash.set.exp2;

public class AxisBank {
	private double balance;
	private String userId;
	private String pass;

	public AxisBank(String userId, String pass, double balance) {
		super();
		this.balance = balance;
		this.userId = userId;
		this.pass = pass;
	}

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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
