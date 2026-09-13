package com.compiletime.polymorphism;


public class User {
   public static void main(String[] args) {
	  
	   PaymentProcessor paymentSever = new PaymentProcessor();
	   
	   PaytmWallet sumit = new PaytmWallet();
	   paymentSever.paymentProcessor(sumit);
	   
	
  }
}
