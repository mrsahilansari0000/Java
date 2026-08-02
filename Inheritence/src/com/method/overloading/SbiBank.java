package com.method.overloading;
class UserLogin{
	
	public void logIn(String mobileNumber, int otp) {
		System.out.println("Login Service (String mobileNumber, int otp)");
	}
	
    public void logIn(String adhaarNumber, int otp, int password) {
    	System.out.println("Login Service (String adhaarNumber, int otp, int password)");
	}
	
    public void logIn(String panNumber, String password) {
    	System.out.println("Login Service (String panNumber, String password)");
	}  
    
    
    public void logIn(int userId, int password) {
    	System.out.println("Login Service (int userId, int password)");
	}
    
	
}


public class SbiBank extends  UserLogin{
      public static void main(String[] args) {
    	  SbiBank user1 = new SbiBank();
    	  user1.logIn("8741-8587-5858", 25478, 56854);
	}
}
