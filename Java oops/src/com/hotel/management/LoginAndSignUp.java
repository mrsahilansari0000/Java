package com.hotel.management;

import java.util.Scanner;

public class LoginAndSignUp extends HotelDatabase{
	RangMahal applicaton = new RangMahal();
	Scanner sc = new Scanner(System.in);
    public void singUp() {
    	String _email;
    	String _password;
    	System.out.println("Enter Your Email Id");
    	_email = sc.nextLine();
    	System.out.println("Enter Your Password");
    	_password = (String) sc.nextLine();
    	StringBuilder email = new StringBuilder(_email);
    	StringBuilder password = new StringBuilder(_password);
    	storeDataBase(email , password);
    }
    
    public void logIn() {
    	accessDataBase();
    	System.out.println("Account Created Please Login");
    	String _email;
    	String _password;
    	System.out.println("Enter Your Email Id");
    	_email = sc.nextLine();
    	System.out.println("Enter Your Password");
    	_password = sc.nextLine();
    	StringBuilder email = new StringBuilder(_email);
    	StringBuilder password = new StringBuilder(_password);
    	for(int i=0; i<tempUserName.length; i++) {
    		if(email.toString().equals(tempUserName[i].toString()) && password.toString().equals(tempUserPassword[i].toString())) {
    			System.out.println("Login Successfully");
    			applicaton.RangMahalApplication();
    			break;
    		}
    	}
    	
    	
    }
}

