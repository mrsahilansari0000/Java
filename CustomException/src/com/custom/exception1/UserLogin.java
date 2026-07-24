package com.custom.exception1;

import java.io.IOException;
import java.security.InvalidParameterException;

class UserLoginException extends RuntimeException {

	public UserLoginException(String expTest) {
        super(expTest);
	}
}

public class UserLogin {
	public static void main(String[] args) throws UserLoginException, NullPointerException, IOException{
           String email = "sumit@gmail.com";
           try {
        	  String _email = "rahul@gmail.com";
        	   if(_email.equals(email)) {
        		   System.out.println("Login Done");
        	   }
        	   else {
        		   throw new UserAlreadyExist("Login Failed");
        	   }
           }
           catch (UserAlreadyExist e) {
			System.err.println(e.getMessage());
		}
	}
}
