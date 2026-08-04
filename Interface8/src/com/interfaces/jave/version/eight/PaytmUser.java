package com.interfaces.jave.version.eight;
interface Payment{
	public static final int balance = 0;
	public abstract void upi();
	public abstract void toMobileNumber();
	public abstract void checkBalance();
	
	public default void cashBack() {
		System.out.println("Payment.cashBack()");
	}
	
	public static void upiTransaction() {
		// 1. Db connection
		// 2. Connect To Gateway
	}
	
	public static void toMobileTrasaction() {
		// 1. Db connection
		// 2. Connect To Gateway
	}
	
	/*
	private static void connectToDb() {
		
	}
	*/
	
}

class Paytm implements Payment{

	@Override
	public void upi() {
		Payment.upiTransaction();
	}

	@Override
	public void toMobileNumber() {
		Payment.toMobileTrasaction();
	}

	@Override
	public void checkBalance() {
		
	}
	
	public void getCashBack(){
		cashBack();
	}
	
}

class PhonePay implements Payment{

	@Override
	public void upi() {
		Payment.upiTransaction();
	}

	@Override
	public void toMobileNumber() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}
	
}

public class PaytmUser {
    public static void main(String[] args) {
		Paytm user1 = new Paytm();
		user1.getCashBack();
		
	}
}
