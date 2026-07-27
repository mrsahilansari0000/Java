package com.banking.system;

public class SbiBank {
        private int balance = 25000;
        private String accountNo = "7845968547854";
        public static float roi = 5.02f;
        
        
        protected void calculateInterest() {
        	float interest = (balance*roi)/100;
        	this.balance = (int) (balance + interest);
        	System.out.println("Total Interest Made: "+interest);
        	System.out.println("Current Bank Balance: "+balance);
        }
        
        public void accountDetails() {
        	System.out.println("Account Details:");
        	System.out.println("Bank Account Number: "+accountNo);
        	System.out.println("Bank Balance: "+balance);
        }
}
