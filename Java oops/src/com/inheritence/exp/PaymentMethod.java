package com.inheritence.exp;

class Upi{
	public void UpiPayment() {
		System.out.println("Payment Done");
	}
}

class Paytm extends Upi{
	public void mobileRecharge(){
		Paytm user1 = new Paytm();
		System.out.println("Mobile Recharge...");
		user1.UpiPayment();
		
	}
}

class PhonePe extends Upi{
	public void fastTagRecharge(){
		PhonePe user2 = new PhonePe();
		System.out.println("FastTag Recharge...");
		user2.UpiPayment();
		
	}
}


public class PaymentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paytm paytmUser = new Paytm();
		PhonePe phonePeUser = new PhonePe();
		paytmUser.mobileRecharge();
		phonePeUser.fastTagRecharge();
		
	}

}
