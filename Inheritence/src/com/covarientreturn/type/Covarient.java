package com.covarientreturn.type;

class Paytm{
	Paytm payPaytm(){
		System.out.println("Paytm");
		return this;
	}
}

class PhonePay extends Paytm{
	PhonePay payPaytm(){
		System.out.println("Phone Pay");
		return this;
	}
}

public class Covarient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhonePay py = new PhonePay();
		py.payPaytm();

	}

}
