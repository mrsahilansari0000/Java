package com.hotel.management;

import java.util.Scanner;

public class RangMahalHotel {
	static Scanner sc = new Scanner(System.in);
       public static void main(String[] args) {
    	   LoginAndSignUp rangMahal  = new LoginAndSignUp();
    	   System.out.println("You Have Already a Account, Yes Or No");
    	   String _valid;
    	   _valid = sc.nextLine();
    	   if(_valid.equals("yes")) {
    		   System.out.println("Please Login To Your Account");
    		   rangMahal.logIn();
    		   
    	   }
    	   else {
    		   System.out.println("Please Create Your Account");
    		   rangMahal.singUp();
    		   rangMahal.logIn();
    	   }
    	   
	}
}
