package com.functional.interfaces3;

public class AxisBank {

	public static void main(String[] args) {
		Bank user = (amount , rateOfInterest)->{
			return (amount*rateOfInterest)/100;
			 
		};
		
		double interest = user.calculateInterest(25000, 5.0d);
		System.out.println("Total Interest: "+interest);
		
	}

}
