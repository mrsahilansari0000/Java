package com.functional.marker.together;

class Hotstar implements Authentication, Cloneable{
	private String mobileNumber = "7485415896";
	private int password = 8574;
	boolean valid = false;
	public String ack = "Welcome To Application";

	@Override
	public boolean verifyUser(String _mobileNumber, int _password) {
		if(_mobileNumber.equals(_mobileNumber) && _password==password) {
			valid = true;
		}
		return valid;
	}
	
	public void login(String _mobileNumber, int _password) {
		verifyUser(_mobileNumber, _password);
    	if(valid) {
    		System.out.println("Login Sucessfully");
 
    	}
    	else {
    		System.err.println("Invalid Details");
    	}
    }
	
	
	@Override
	public Hotstar clone() throws CloneNotSupportedException {
		 return (Hotstar) super.clone();
	}
}



public class UserLogin {
     public static void main(String[] args) throws CloneNotSupportedException {
    	 Hotstar user1 = new Hotstar();
    	 Hotstar user2 = (Hotstar) user1.clone();
    	 user1.login("7485415896", 8574);
    	 user2.login("7485415896", 8574);
	}
}
