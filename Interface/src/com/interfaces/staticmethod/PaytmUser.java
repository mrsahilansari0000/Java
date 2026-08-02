package com.interfaces.staticmethod;

 class Paytm implements Payment{
	@Override
	public void upi() {
		System.out.println("Paytm.upi()");
	}

	@Override
	public void netBanking() {
		System.out.println("Paytm.netBanking()");
	}

	@Override
	public void creditCard() {
		System.out.println("Paytm.creditCard()");
	}
	
	public void getCashBack() {
		Payment.cashBack();
	}
	
	
}

public class PaytmUser{
	public static void main(String[] args) {
		Paytm user1 = new Paytm();
		user1.getCashBack();
	}
}
