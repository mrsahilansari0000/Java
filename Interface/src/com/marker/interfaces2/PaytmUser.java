package com.marker.interfaces2;

class Payment implements Paymentable {
	private int balance;
	String upiId;
	private int upiPin;

	public Payment(int balance, String upiId, int upiPin) {
		super();
		this.balance = balance;
		this.upiId = upiId;
		this.upiPin = upiPin;
	}

	public void paymentDetails() {
		System.out.println("Account Balance: " + balance);
	}

}

class Paytm {

	public void doPayment(Object obj) {

		if (obj instanceof Payment) {
			Payment payment = (Payment) obj;
			payment.paymentDetails();
			// obj.paymentDetails();
			System.out.println("Payment Under Processing");
			System.out.println("Payment Done");
			System.out.println(payment.upiId);
		} else {
			System.err.println("Payment Failed");
		}

	}

}

public class PaytmUser {
	public static void main(String[] args) {
		Payment payment = new Payment(20000, "tower@paytm", 8745);
		Paytm user2 = new Paytm();
		user2.doPayment(payment);

	}
}
