package com.interfaces.example;

public class HDFC implements Account {

	private double balance;
	private String userId;
	private String userPass;
	private double roi = 5.02f;
	
	
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

	public HDFC(String userId, String userPass ,double balance) {
		super();
		this.userId = userId;
		this.userPass = userPass;
		this.balance = balance;
	}

	@Override
	public void depositAmount(double dAmount) {
		if(dAmount>0) {
			this.balance = balance + dAmount;
		}
		else {
			System.err.println("Invalid Amount");
		}
	}

	@Override
	public void withdrawlAmount(double wAmount) {
		if(wAmount>=balance && balance>=MIN_AMOUNT) {
			this.balance = balance - wAmount;
		}
		else {
			System.err.println("Invaid Amount Or LOW Balance");
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Bank Balance: "+balance);
	}

	@Override
	public void calculateInterest() {
	    if(balance>=MIN_AMOUNT) {
	    	double interest = (balance*roi)/100;
	    	this.balance = balance+interest;
	    }
	    else {
	    	System.err.println("Minimum Balance Required");
	    }
	}

}
