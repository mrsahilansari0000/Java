package com.runtime.polymorphism2;

public class Features implements Ecommerce{

	@Override
	public void login() {
		System.out.println("Features.login()");
	}

	@Override
	public void adCart() {
		System.out.println("Features.adCart()");
	}

	@Override
	public void placeOrder() {
		System.out.println("Features.placeOrder()");
	}

}
