package com.runtime.polymorphism2;

public class Amazon extends Features {
	@Override
	public void login() {
		System.out.println("Amazon.login()");
	}

	@Override
	public void adCart() {
		System.out.println("Amazon.adCart()");
	}

	@Override
	public void placeOrder() {
		System.out.println("Amazon.placeOrder()");
		Ecommerce.doPayment();
	}
}
