package com.java.abstracts.keyword;
abstract class Payment{
	abstract void doPayment();
	abstract void doPayment(int k);
}

class Upi extends Payment{
	void doPayment(){
		System.out.println("Upi.doPayment()");
	}
	void doPayment(int a){
		System.out.println("Upi.doPayment()");
	}
}

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment user1 = new Upi();
		user1.doPayment(25);
	}

}
