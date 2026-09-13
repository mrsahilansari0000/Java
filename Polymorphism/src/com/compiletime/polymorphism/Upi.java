package com.compiletime.polymorphism;

public class Upi extends Payment{
	@Override
	public void payment() {
   	 String upiId;
   	 int pin;
   	 System.out.println("Enter Upi Id");
   	 upiId = userInput.nextLine();
   	 System.out.println("Enter Upi Pin");
     pin = userInput.nextInt();
   	 
   	 paymentAuthentication(upiId,pin);
   	 
   	 if(valid) {
   		 System.out.println("Upi.payment()");
   	 }
   	 else {
   		 System.out.println("Invalid Details");
   	 }
    }
}
