package com.paymentsystem.method.overriding;

class AxisBank{
	private int bankBalance;
	
	
    public void storeDataBase(int _transactionAmount){
		this.bankBalance = bankBalance + _transactionAmount;
	}

	public void showCurrentBalance(){
		System.out.println("Current Bank Balance "+bankBalance);
	}
	
	
}

class PaymentSystem extends AxisBank{
	
	public void pay(String _upiId , int _amount) {
		System.out.println("Payment Under Processing");
		System.out.println("Payment of "+_amount+"$"+" Successfully Sent to "+_upiId);
		storeDataBase(_amount);
	}
	
}


class PhonePay extends PaymentSystem{
	public void pay(String _upiId , int _amount) {
		System.out.println("PhonePay Payment UnderProcessing");
		System.out.println("Payment Sent Successfuly to "+_upiId);
		storeDataBase(_amount);
	}
}


class Gpay extends PaymentSystem{
	public void pay(String _upiId , int _amount) {
		System.out.println("Gpay Payment UnderProcessing");
		System.out.println("Payment Sent Successfuly to "+_upiId);
		storeDataBase(_amount);
	}
}


public class PayOnline {
   public static void main(String[] args) {
	   PhonePay rahul = new PhonePay();
	   Gpay sumit = new Gpay();
	   rahul.pay("8798542585@ybl", 36000);
	   rahul.pay("8798542585@ybl", 36000);
	   sumit.pay("7485965874@paytm" , 70000);
	   rahul.showCurrentBalance();
	   
}
}
