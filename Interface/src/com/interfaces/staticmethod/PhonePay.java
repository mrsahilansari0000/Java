package com.interfaces.staticmethod;

public class PhonePay implements Payment {

	@Override
	public void upi() {
		System.out.println("PhonePay.upi()");
	}

	@Override
	public void netBanking() {
		System.out.println("PhonePay.netBanking()");
	}

	@Override
	public void creditCard() {
		System.out.println("PhonePay.creditCard()");
	}

}
