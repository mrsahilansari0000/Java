package com.multiple.inheritence.interfaces;

class PaytmUser implements Payment, Paytm {

	@Override
	public void upi() {
       System.out.println("User.upi()");
	}
	
	public void toMobileNumber() {
		System.out.println("User.toMobileNumber()");
	}

}
