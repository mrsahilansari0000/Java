package com.array.list.exp6;

public class Hotstar implements Ott {
	private String email;
	private String pass;

	public Hotstar(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public void logIn(String _email, String _password) {
		HotstarDatabase auth = new HotstarDatabase();
		boolean token = auth.getAuth(_email, _password);
		if(token) {
			System.out.println("Login Successfully");
		}
		else {
			System.err.println("Invalid Details");
		}
	}

}
