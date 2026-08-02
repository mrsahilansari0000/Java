package com.ott.platform;

public class Netflix implements OttPlatform {

	@Override
	public void signUp(String mobileNumber , String Password) {
		dbConnection();
		createAccount();
	}

	@Override
	public void logIn(String mobileNumber , String Password) {
		dbConnection();
		validateUser();
	}

	@Override
	public void subscribe() {
		premiumSubscription();
		upiPayment();	
	}

	@Override
	public void cancelSubscription() {
		removePlan();
	}

	@Override
	public void applyCoupon() {
		couponDiscount();
		
	}
	
	private void dbConnection() {
		System.out.println("Connect To Db....");
	}
	
	private void createAccount() {
		System.out.println("Account Created Succesfully...");
	}
	
	private void validateUser() {
		System.out.println("Login Succesfully");
	}

	private void premiumSubscription() {
		System.out.println("Choose Plans");
	}
	
	private void upiPayment() {
		System.out.println("Payment Under Processing...");
		System.out.println("Premium Plan is Active Expire on 28-may-2026");
	}
	
	private void removePlan() {
		System.out.println("Plan is Deavtivated. Refund Under Processing");
	}
	
	private void couponDiscount() {
		System.out.println("You Got 15% Discount As a First User");
	}

}
