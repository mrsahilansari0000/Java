package com.bank.example.singlefile;

class UserData{
	private String userId = "user@gmail.com";
	private int password = 12345;
	
	 void details() {
		System.out.println("User Details:");
		System.out.println("UserId: "+userId);
		System.out.println("Password: "+password);
	}
} 
class AdminUser extends UserData{
	private String adminUserId = "admin@gmail.com";
	private int adminPassword = 54321;
	@Override
	protected void details() {
		System.out.println("AdminUser Details:");
		System.out.println("UserId: "+adminUserId);
		System.out.println("Password: "+adminPassword);
	}
}

class CustomerUser extends UserData{
	private String customerUserId = "customer@gmail.com";
	private int CustomerPassword = 00000;
	@Override
	protected void details() {
		System.out.println("CustomerUser Details:");
		System.out.println("UserId: "+customerUserId);
		System.out.println("Password: "+CustomerPassword);
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerUser c = (CustomerUser) new UserData();
		CustomerUser x = c;
		x.details();
	}

}
