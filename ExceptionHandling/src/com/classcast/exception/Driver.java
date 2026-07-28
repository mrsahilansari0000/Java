package com.classcast.exception;

class Payment{
	public void upiPay() {
		System.out.println("Payment.upiPay()");
	}
}

class AxisBank extends Payment{
	@Override
	public void upiPay() {
		System.out.println("AxisBank.upiPay()");
	}
}

class SbiBank extends Payment{
	@Override
	public void upiPay() {
		System.out.println("SbiBank.upiPay()");
	}
}

public class Driver {
    public static void main(String[] args) {
		//AxisBank pay = (AxisBank) new Payment(); -> It will throw ClassCastException
    	Payment pay = new AxisBank();
		pay.upiPay();
	}
}
