package com.interfaces.example;

public interface Account {
	 
	   final static int MIN_AMOUNT = 1000;
	
       public abstract void depositAmount(double dAmount);
       public abstract void withdrawlAmount(double wAmount);
       public abstract void checkBalance();
       public abstract void calculateInterest();
}
