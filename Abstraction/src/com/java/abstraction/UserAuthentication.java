package com.java.abstraction;

public class UserAuthentication extends DataBase {
      public void userLogIn(String _mobileNumber , String _password) {
    	  if(auth) {
    		  connectToDb();
        	  encryption();
        	  validateUser(_mobileNumber , _password);
    		  System.out.println("Login Succesfully");
    	  }
    	  else {
    		  System.out.println("Invalid Details");
    	  }
      }
      
      private void connectToDb() {
    	  System.out.println("UserAuthentication.connectToDb()");
      }
      
       private void encryption() {
    	  System.out.println("UserAuthentication.encryption()");
      }
       
       private void validateUser(String _mobileNumber , String _password) {
    	   checkingValidation(_mobileNumber , _password);
       }
      
      
}
