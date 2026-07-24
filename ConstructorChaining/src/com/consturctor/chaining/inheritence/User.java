package com.consturctor.chaining.inheritence;
class Payment{
	Payment(){
		System.out.println("Payment.Payment()");
	}
}

class Upi extends Payment{
	Upi(){
		//super();
		System.out.println("Upi.Upi()");
	}
}
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upi user1 = new Upi();
		
	}

}
