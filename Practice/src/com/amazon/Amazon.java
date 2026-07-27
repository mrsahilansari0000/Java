package com.amazon;

public class Amazon implements Ecommerce {

	String gmail;
	String password;

	public Amazon(String gmail, String password) {
		super();
		this.gmail = gmail;
		this.password = password;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void addToCart() {

	}

	@Override
	public void doPayment() {

	}

}
