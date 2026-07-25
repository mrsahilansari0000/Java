package com.java.datatype;
// Initialization of Instance Variable can be done only in Constructor and Instance Method.
// We Initialize the static variable in instance method and static method also.

public class DeclareAndInitialize{
	int accountBalance;
	static int finalBalance;
	
	public void assignValue() {
		 // not allowed 
		 // static int h;
		 //allowed
		// accountBalance = 900;
		 finalBalance = 100;
	}
	
	
	DeclareAndInitialize(){
		this.accountBalance = 200;
	}
 public static void main(String[] args) {
	 finalBalance = 300;
	 DeclareAndInitialize obj = new DeclareAndInitialize();
	 obj.assignValue();
	 System.out.println(obj.accountBalance);
	 System.out.println(finalBalance);
	 // accountBalance = 100;
} 
 
 
}
