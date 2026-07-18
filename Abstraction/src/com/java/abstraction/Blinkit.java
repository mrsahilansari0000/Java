package com.java.abstraction;

import java.util.Scanner;

public class Blinkit {
	static Scanner sc = new Scanner(System.in);
     public static String _tempmobileNumber;
     public static String _tempPassword;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAuthentication user1 = new UserAuthentication();
          System.out.println("Please Login");
          System.out.println("Enter Mobile Number");
          _tempmobileNumber = sc.nextLine();
          System.out.println("Enter Password");
          _tempPassword = sc.nextLine();
          
          user1.userLogIn(_tempmobileNumber, _tempPassword);

          
          
            
	}

}
