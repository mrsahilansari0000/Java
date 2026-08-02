package com.upcasting.downcasting;
class Upi{
	
	public void showMessage(int k) {
		System.out.println("Message Read");
	}
}

class Paytm extends Upi{
	public void showMessage() {
		System.out.println("Message Read...");
	}
	
	public void showMessage(int a) {
		System.out.println("Message Read...!");
	}
}

public class AxisBank {
  public static void main(String[] args) {
	  // Parent class can refer child class object. Here it will be Auto Up Casting.
	  Upi upi   = (Upi) new Paytm();
	  //Paytm paytm   = (Paytm) new Upi();// (Upi) --> ByDefault
	  upi.showMessage(25); // Which method to call it decided by runtime polymorphism.
	  // Child class cannot refer parent class object without down casting.
	    // (Paytm) --> Down Casting
	  //paytm.showMessage();
}
}
