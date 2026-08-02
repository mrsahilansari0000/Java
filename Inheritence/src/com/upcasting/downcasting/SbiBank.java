package com.upcasting.downcasting;
class Account{
	private int balance;
	Account(int _amount){
		this.balance = _amount;
		
	}
	
	public int showBalance() {
		return balance;
	}
}

class SavingAccount extends Account{
	SavingAccount(int _amount){
		super(_amount);
	}
	
	
	public int showBalance() {
		System.out.println("Saving Account");
		return 0; 
	}
}


public class SbiBank {
     public static void main(String[] args) {
    	 SavingAccount user1 = new SavingAccount(25000);
    	 System.out.println(user1.showBalance());
	}
}  
