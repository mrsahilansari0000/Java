package com.payment.system;

class Payment{
	public void processPayment(String cardNumber) {
		System.out.println("Credit Card");
	}
	
	public void processPayment(String upiID, int upiPin) {
		System.out.println("Upi Pay");
	}
}



public class User {
	public static void main(String[] args) {
		Payment pays = new Payment();
	    pays.processPayment("93030430490");
	}
    
}
