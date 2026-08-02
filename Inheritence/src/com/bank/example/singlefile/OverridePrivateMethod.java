package com.bank.example.singlefile;
class DataBase{
	
	public void run() {
		userDetails();
	}
	private void userDetails() {
		System.out.println("DataBase.userDetails()");
	}
	
}

class User extends DataBase{
	
  void userDetails() {
		System.out.println("User.userDetails()");
	}
	
}
public class OverridePrivateMethod {
public static void main(String[] args) {
	
	DataBase user1 = new DataBase();
	user1.run();
}
}
