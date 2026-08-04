package com.interfaces.java.version.nine;


interface Payment{
	
	public abstract void upi();
	public abstract void toMobileNumber();
	public abstract void checkBalance();
	
	public default void cashBack() {
		System.out.println("Payment.cashBack()");
	}
	
	public static void upiTransaction() {
		// 1. Db connection
		// 2. Connect To Gateway
		connectToDb();
		connectToGateway();
	}
	
	public static void toMobileTrasaction() {
		// 1. Db connection
		// 2. Connect To Gateway
		connectToDb();
		connectToGateway();
	}
	
    private static void connectToDb() {
		System.out.println("Payment.connectToDb()");
	}
    
    private static void connectToGateway() {
		System.out.println("Payment.connectToGateway()");
	}
	
}

class Paytm implements Payment{

	@Override
	public void upi() {
		Payment.upiTransaction();
	}

	@Override
	public void toMobileNumber() {
		
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
		
	}

	@Override
	public void checkBalance() {
		
	}
	
}

public class PaytmUser {
    public static void main(String[] args) {
		Paytm user1 = new Paytm();
		user1.getCashBack();
		
	}
}
