package com.methodoverride.rule;

class Upi{
	
	 public void upiPayment(String _upiId, int _upiPin, int _amount) {
		 System.out.println("Upi Done");
	 }
}

class Paytm extends Upi{
	  
	@Override // check the rule for override in right manner or not
	public void upiPayment(String _upiId, int _upiPin, int _amount) {
		System.out.println("Paytm Done");
	}
	
}

public class Driver {
public static void main(String[] args) {
	Paytm user1 = new Paytm();
	user1.upiPayment("7841258574@ybl", 8630, 25000);
	
}
}
