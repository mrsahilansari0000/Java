package com.interfaces.defaultmethod3;
import com.ott.platform.OttPlatform;

class JioCinema extends OttDataBase implements OttPlatform {

	@Override
	public void signUp(String mobileNumber , String password) {
		dbConnection();
		createAccount(mobileNumber, password);
		if(valid) {
			System.out.println("Account Created");
		}
		else {
			System.out.println("Invalid Details");
		}
	}

	@Override
	public void logIn(String mobileNumber , String password) {
		dbConnection();
		validateUser(mobileNumber, password);
        if(valid) {
			System.out.println("Login");
		}
		else {
			System.out.println("Invalid Details");
		}
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
	
	private void createAccount(String mobileNumber , String password) {
		ottAuthentication(mobileNumber, password);
	}
	
	private void validateUser(String mobileNumber , String password) {
		ottAuthentication(mobileNumber,password);
		
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
 
  class JioCinemaUser{
	 public static void main(String[] args) {
		 JioCinema user1 = new JioCinema();
		 user1.signUp("9929284998", "user@123");
		 user1.logIn("9929284998", "user@123");
				 
	}
 }
