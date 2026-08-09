package com.inheritence.overriding;
class Upi{
	public void upiPayment(String _upiId , int _amount) {
		System.out.println("Payment of "+_amount+"$"+" Successfully Sent to "+_upiId);
	}
}

class PhonePay extends Upi{
	// Overriding Method
	public void upiPayment(String _upiId , int _amount) {
		System.out.println("Payment Sent Successfuly to "+_upiId);
		
	}
}

class Paytm extends Upi {
	
}


public class OnlinePayment {
 public static void main(String[] args) {
	 PhonePay user1 = new PhonePay();
	 Paytm user2 = new Paytm();
	 user1.upiPayment("8874859685@ybl", 25000);
	 user2.upiPayment("8996989625@ybl", 60000);
}
}
