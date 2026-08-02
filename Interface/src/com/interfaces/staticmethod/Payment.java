package com.interfaces.staticmethod;

public interface Payment {
	     public static final int balance = 0;
         public abstract void upi();
         public abstract void netBanking();
         public abstract void creditCard();
         
         public static void cashBack() {
        	 // 5000 Lines Of Code
        	 System.out.println("Payment.cashBack()");

         }
         
         
}
