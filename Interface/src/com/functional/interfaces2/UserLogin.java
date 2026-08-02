package com.functional.interfaces2;

class Hotstar implements Authentication{
	private String mobileNumber = "7485415896";
	private int password = 8574;
	boolean valid = false;

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
    		System.out.println("Invalid Details");
    	}
    }
	

}



public class UserLogin {
     public static void main(String[] args){
    	 Hotstar user1 = new Hotstar();
    	 user1.login("7485415896", 8574);
	}
}
