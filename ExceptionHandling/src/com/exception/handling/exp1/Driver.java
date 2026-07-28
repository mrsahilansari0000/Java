package com.exception.handling.exp1;

import java.util.Scanner;
import java.util.*;

public class Driver {
	 static String name = "Hello";
	 static String otp;
	 static Scanner sc = new Scanner(System.in);
	 static int finalOtp;
	
      public static void main(String[] args) {
    	  otp = args[0];  
    	 // int finalOtp = Integer.parseInt(otp); // NumberFormatExeption when you not provide the correct input for Integer Because It will be parse as a integer
		  System.out.println(args[1]);
		  System.out.println("Enter the Number");
		  
		  try
		  {
		  int testData = sc.nextInt(); //InputMismatchException
		  System.out.println(testData);
		  System.out.println("Data Insert Succesfully");
		   finalOtp = Integer.parseInt(otp);
		  }
		  
		  catch(InputMismatchException e) {
			   e.printStackTrace();
			   System.out.println("Invalid Input");
		  }
		  
		  catch(NumberFormatException e) {
			
		  }

		  
		 System.out.println(finalOtp);
		 System.out.println(name.length()); // NullPointerException
		 
		 
	}  
}
