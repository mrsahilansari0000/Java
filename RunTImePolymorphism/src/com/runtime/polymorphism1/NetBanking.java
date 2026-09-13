package com.runtime.polymorphism1;

public class NetBanking extends Payment{
	@Override
	public void doPayment() {
    	System.out.println("NetBanking.doPayment()");
    }
}
