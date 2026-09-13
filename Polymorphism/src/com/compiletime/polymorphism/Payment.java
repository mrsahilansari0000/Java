package com.compiletime.polymorphism;

import java.util.Scanner;

public class Payment extends Database {
	Scanner userInput = new Scanner(System.in);
     public void payment() {
    	 String bankAccount;
    	 String ifsc;
    	 int otp;
    	 System.out.println("Enter Bank Account Number");
    	 bankAccount = userInput.nextLine();
    	 System.out.println("Enter IFSC Code");
    	 ifsc = userInput.nextLine();
    	 System.out.println("Enter Otp");
    	 otp = userInput.nextInt();
    	 
    	 paymentAuthentication(bankAccount,ifsc,otp);
    	 
    	 if(valid) {
    		 System.out.println("Payment.payment()");
    	 }
    	 else {
    		 System.out.println("Invalid Details");
    	 }
     }
}
