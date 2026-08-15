package com.login.system.maven;

public class Login {
	private String _email = "testcase@gmail.com";
	private String _password = "test@123";
	private boolean auth;

	public boolean login(String email, String password) {
		if (_email.equals(email) && _password.equals(password)) {
			System.out.println("Login Successfully");
			auth = true;
		}
		else {
			System.err.println("Login Failed");
			auth = false;
		}
		return auth;
	}
}
