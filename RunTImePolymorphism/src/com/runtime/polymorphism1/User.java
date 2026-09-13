package com.runtime.polymorphism1;

public class User extends PaymentProcess {
   public static void main(String[] args) {
	   PaymentProcess payProcess = new PaymentProcess();
	   Upi rahul = new Upi();
	   payProcess.paymentProcess(rahul);
	   NetBanking sumit = new NetBanking();
	   payProcess.paymentProcess(sumit);
	   
	   
}
}
