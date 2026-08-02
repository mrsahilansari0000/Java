package com.functional.interfaces4;

@FunctionalInterface
interface Factorial{
	public abstract void calculateFactorial(int number);
}

public class GetFactorial {
	static double factorial=1;
     public static void main(String[] args) {
		Factorial operation = (number)->{
			while(number>0) {	
				factorial = factorial*number;
				number--;
			}
			
		};
		operation.calculateFactorial(50);
		System.out.println(factorial);
	}
} 
