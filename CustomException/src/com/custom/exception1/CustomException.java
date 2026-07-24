package com.custom.exception1;

import java.io.FileNotFoundException;

class UserAlreadyExist extends Exception {
	public UserAlreadyExist(String expTest) {
        super(expTest);
	}
}

public class CustomException{
	public static void main(String[] args) throws NullPointerException{
           String name = "sumit";
           try {
        	   name = "rahul";
        	   if(name!="sumit") {
        		   throw new UserAlreadyExist("Data Not Matched");
        	   }
           }
           catch (UserAlreadyExist e) {
			System.out.println(e.getMessage());
		}
	}
}
