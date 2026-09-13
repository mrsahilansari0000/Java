package com.runtime.polymorphism2;

public class Flipkart extends Features {
	
	@Override
	public void login() {
		System.out.println("Flipkart.login()");
	}

	@Override
	public void adCart() {
		System.out.println("Flipkart.adCart()");
	}

	@Override
	public void placeOrder() {
		System.out.println("Flipkart.placeOrder()");
		Ecommerce.doPayment();
	}
}
