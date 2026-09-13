package com.compiletime.polymorphism;

public class Database {
     private String bankAccountNumber = "98765432123456";
     private int otp = 5874;
     public String ifscCode = "BARB0"; 
     private String upiId ="9929284998@ybl";
     private int upiPin =6985;
     private String mobileNumber= "9929284998";
     private String password = "user@123";
     public boolean valid = false;
     
//     public boolean logIn(String _accountNumber, String _ifscCode ,int _otp) {
//    	 paymentAuthentication();
//    	 return true;
//     }
     
     
     
     public boolean paymentAuthentication(String _accountNumber, String _ifscCode ,int _otp ){
    	 if(_accountNumber.equals(bankAccountNumber) && _ifscCode.equals(ifscCode) && _otp==otp)
    	 {
    		 valid = true;
    	 }
    	 
    	  return valid;
     }
     
     public boolean paymentAuthentication(String _upiId, int _upiPin ){
    	 if(_upiId.equals(upiId) && _upiPin==upiPin)
    	 {
    		 valid = true;
    	 }
    	 
    	  return valid;
     }
     
     public boolean paymentAuthentication(String _mobileNumber, String _password ){
    	 if(_mobileNumber.equals(mobileNumber) && _password.equals(password))
    	 {
    		 valid = true;
    	 }
    	 
    	  return valid;
     }
     
     
}
