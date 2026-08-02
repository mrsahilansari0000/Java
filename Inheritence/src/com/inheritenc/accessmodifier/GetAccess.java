package com.inheritenc.accessmodifier;
class User{
	String name;
	private String email;
	
	User(){
		System.out.println("User.User()");
	}
	protected User(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	public void getData() {
		System.out.println(name);
		System.out.println(email);
	}
}


class AdminUser extends User{

	AdminUser(String name, String email) {
		
		
	}
	
}

class CustomerUser extends User{

	CustomerUser(String name, String email) {
		
		
		
	}
	
}


public class GetAccess {
public static void main(String[] args) {
	AdminUser user = new AdminUser("Rahul", "xyz@gmail.com");

	
}
}
