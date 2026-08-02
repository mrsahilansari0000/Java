package com.ott.platform;

public class HotStarDataBase {
	private String mobileNumber= "9929284998";
    private String password = "user@123";
    public boolean valid = false;
    
    public boolean ottAuthentication(String _mobileNumber, String _password){
   	 if(_mobileNumber.equals(mobileNumber) && _password.equals(password))
   	 {
   		 valid = true;
   	 }
   	 
   	  return valid;
    }
   
}
