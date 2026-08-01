package com.hash.set.exp2;

public class AxisBankUser {

	public static void main(String[] args) {
		AxisBank user = new AxisBank("rahulsharma@axis", "rahul@567", 25000);
		AxisBankDataBase db = new AxisBankDataBase();
		boolean status = db.logIn("rahulsharma@axis", "rahul@567");
		if(status) {
			System.out.println("Current Bank Balance: "+user.getBalance());
		}
		else {
			System.err.println("Invalid Details");
		}

	}

}
