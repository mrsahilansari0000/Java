package com.custom.exception3;

import java.io.IOException;

public class User {
  public static void main(String[] args) throws ClassNotFoundException {
	 UserRegistration user = new UserRegistration();
	 try {
		user.userRegistration("shyam@gmail.com");
	} 
	 
	 catch(EmailAlreadyExistException e) {
		 System.err.println(e.getMessage());
	 }
}
}
