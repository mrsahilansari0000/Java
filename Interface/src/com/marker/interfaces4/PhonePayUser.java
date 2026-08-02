package com.marker.interfaces4;

class Payment implements Paymentable{
	private String balance;
	String upiId;
	private int upiPin;
	
	public Payment(String balance, String upiId, int upiPin) {
		super();
		this.balance = balance;
		this.upiId = upiId;
		this.upiPin = upiPin;
	}
	
	
}

class PhonePay {
	

	public void upiPayment(Object obj) {
		PhonePay phonepay = (PhonePay) obj;
		if(obj instanceof Payment) {
			System.out.println("Payment Done");
		}
		else {
			System.out.println("Payment Failed");
		}
	}
}


public class PhonePayUser {
      public static void main(String[] args) {
    	 Payment data = new Payment("25000", "apex@gmail.com", 7878);
    	  PhonePay user = new PhonePay();
    	  user.upiPayment(user);
	}
}
