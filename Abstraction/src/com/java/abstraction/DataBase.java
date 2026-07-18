package com.java.abstraction;

public class DataBase{
	 boolean auth = false;
     private String mobileNumber = "9929284998";
     private String password = "kode@123";
     
     public void checkingValidation(String _mobileNumber , String _password) {
    	 authentication(_mobileNumber , _password);
     }
     
     private boolean authentication(String _mobileNumber , String _password) {
    	 if(_mobileNumber.equals(mobileNumber) && _password.equals(password)) {
    		 auth = true;

    	 }
    	 return auth;
     }
}
