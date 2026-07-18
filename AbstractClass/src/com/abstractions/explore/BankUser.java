package com.abstractions.explore;
interface Test{
	public abstract void gateway();
}

abstract class Payment implements Test{
	public abstract void netBanking();
	public abstract void upi();
	public 
	int a = 40;
	public static void dbConnection() {
		System.out.println("Payment.dbConnection()");
	}
	
	public static void main() {
		System.out.println("Payment.main()");
	}
}


class AxisBank extends Payment{
   
	public static void dbConnection(){
		System.out.println("AxisBank.dbConnection()");
	}
	
	
	@Override
	public void netBanking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upi() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void gateway() {
		// TODO Auto-generated method stub
		
	}
	
}

public class BankUser {
 public static void main(String[] args) {
	 AxisBank user = new AxisBank();
	 user.a=900;
	 user.main();
}
}
