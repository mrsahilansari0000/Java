package com.compiletime.polymorphism;

import java.util.Scanner;

public class PaytmWallet extends Payment {
	Scanner userInput = new Scanner(System.in);
	@Override
	public void payment() {
   	 String mobileNumber;
   	 String password;
   	 System.out.println("Enter Mobile Number");
   	 mobileNumber = userInput.nextLine();
   	 System.out.println("Enter Wallet Password");
   	 password = userInput.nextLine();
   	 
   	 paymentAuthentication(mobileNumber,password);
   	 
   	 if(valid) {
   		 System.out.println("PaytmWallet.payment()");
   	 }
   	 else {
   		 System.out.println("Invalid Details");
   	 }
    }
}
