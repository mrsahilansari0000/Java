package com.functional.interfaces1;


@FunctionalInterface
interface PaymentProcessor
{
	public abstract void processPayment(double amount, int interest);
}



public class LamdaExpression {
   public static void main(String[] args) {
	   PaymentProcessor creditCardPayment = (amount,interest)->{
		   System.out.println("Amount is: "+(amount+interest)
				   
				   );
	   };
	  
	   
	   creditCardPayment.processPayment(20000, 5000);
}
}
