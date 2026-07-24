package com.custom.exception4;

class Netflix{
	private String emailId = "sumikumar@gmail.com";
	private int password = 7485;
	static boolean auth = false;
	static boolean premium = false;
	
	public boolean doLogin(String _email, int _password) {
		if(_email.equals(emailId) && _password==password) {
			System.out.println("Login Succesfully");
			auth = true;
		}
		else {
			throw new LoginFailedException("Invalid Details Login Failed");
		}
		return auth;
	}
	
	public boolean purchasePremium(){
		if(auth) {
			System.out.println("Connect To Db");
			System.out.println("Connect To Payment GateWay");
			System.out.println("Payment Succesfully");
		}
		else {
			System.out.println("Please Login For Purchsase Premium");
		}
		return premium;
	}
	
	
	public void playMovie() {
		if(premium) {
			System.out.println("Movie Playing......");
		}
		else {
			System.err.println("Please Purchase Premium For Play The Movie....");
		}
	}
	
}

public class NetflixUser {
    public static void main(String[] args) {
    	Netflix user = new Netflix();
    	try {
    		user.doLogin("sumikumar@gmail.com", 7485);
    		if(Netflix.auth) {
    			user.playMovie();
    		}
    	}
    	catch (LoginFailedException | NullPointerException e) {
			System.err.println(e.getMessage());
		}
    
    	
	}
}
