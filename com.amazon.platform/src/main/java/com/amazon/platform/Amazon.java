package com.amazon.platform;

import java.util.Arrays;
import java.util.List;

public class Amazon implements Ecommerce {
	private boolean auth = false;
	private boolean payStatus = false;
	private String orderStatus;

	private String upiId = "testcase@paytm";
	private int upiPin = 4444;

	@Override
	public boolean login(String _upiId, int _upiPin) {
		if (upiId.equals(_upiId) && upiPin == _upiPin) {
			System.out.println("Login Succesfully....");
			auth = true;
			System.out.println("Available Product");
			getProductList();
		} else {
			System.out.println("Login Failed....");
			auth = false;
		}
		return auth;
	}

	@Override
	public boolean upi(String _upiId, int _upiPin) {
		if (upiId.equals(_upiId) && upiPin == _upiPin) {
			System.out.println("Payment Under Processing...");
			payStatus = true;
			getStatus();
			
		} else {
			System.out.println("Payment Failed");
			payStatus = false;
		}
		return payStatus;
	}

	@Override
	public String getStatus() {
        if(payStatus) {
        	orderStatus = "Order Placed";
        }
        else {
        	orderStatus = "Try Again";
        }
		return orderStatus;
	}

	public void getProductList() {
		List<String> product = Arrays.asList("Laptop", "Mouse", "LED", "Keyboard");
		System.out.println(product);
	}

	public boolean isAuth() {
		return auth;
	}

	public boolean isPayStatus() {
		return payStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public String getUpiId() {
		return upiId;
	}

	public int getUpiPin() {
		return upiPin;
	}
	
	

}
