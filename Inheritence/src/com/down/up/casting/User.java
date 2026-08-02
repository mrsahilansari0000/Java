package com.down.up.casting;

class Payment{
	int balance = 100;
	
	public void getData(){
		System.out.println("Parnet: "+balance);
	}
}

class AxisBank extends Payment{
	public void getData(){
		System.out.println(balance);
		super.getData();
	}
}

public class User {
public static void main(String[] args) {
	Payment pay = new AxisBank();
	AxisBank user = (AxisBank) pay;
	user.getData();
	pay.getData();

}
}
