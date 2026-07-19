package com.amazon.platform;

public class AmazonUser {
	public static void main(String[] args) {
		Amazon amazon = new Amazon();
		String placedStatus;
		boolean loginStatus = amazon.login("testcase@paytm", 4444);

		if (loginStatus) {
			amazon.upi("testcase@paytm", 4444);
		}
        
		else {
			System.err.println("Login Failed");
		}
		
		System.out.println(amazon.getOrderStatus());
	}
}
