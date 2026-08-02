package com.marker.interfaces3;

class User implements Cloneable{
	private String emailId = "adminserver@gmail.com";
	
	public void getEmail() {
		System.out.println("User Email Id: "+emailId);
	}
	
	@Override
	public User clone() throws CloneNotSupportedException {
	    return (User) super.clone(); // Object class clone
	}
}



public class MarkerInterface {
  public static void main(String[] args) throws CloneNotSupportedException {
	  User admin = new User();
	  User rahul = (User ) admin.clone();
	  rahul.getEmail();
}
}
