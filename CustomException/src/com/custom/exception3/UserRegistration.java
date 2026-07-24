package com.custom.exception3;

import java.io.IOException;
import java.util.InputMismatchException;

public class UserRegistration {
	static boolean auth = false;
	String emailId = "kodewala@gmail.com";
     public void userRegistration(String email) throws EmailAlreadyExistException, ClassNotFoundException{
    	 if(email.equals(emailId)) {
    		 throw new EmailAlreadyExistException("User Already Registered Please Login");
    	 }
    	 else {
    		 auth = true;
    	 }
    	 
    	 if(auth) {
    		 System.out.println("User Registered Successfully");
    	 }
    	 
    	 try {
			Class.forName("com.custom.exception3.UserRegistrationss");
		} 
    	 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	 
     }
}
