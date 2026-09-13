package com.runtime.polymorphism1;

public class Upi extends Payment {
	@Override
	public void doPayment() {
    	System.out.println("Upi.doPayment()");
    }
}
 