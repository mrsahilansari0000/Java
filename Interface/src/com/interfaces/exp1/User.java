package com.interfaces.exp1;
interface Payment{
	// Variables in a interface are public static and final
	public static final int balance=1000;
	
	public abstract void setBalance();
	public abstract void getBalance();
}

interface Logs extends Payment{
	// Variables in a interface are public static and final
	int balance=1000;
	
	public abstract void setBalance();
	public abstract void getBalance();
}

class Upi implements Payment{

	//public abstract void api();
	
	
	public void getData() {
		System.out.println(balance);
	}
	
	
	@Override
	public void setBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		
	}
	
}

public class User {
 public static void main(String[] args) {
	 Upi user = new Upi();
	 user.getData();
	 
	 
}
}
