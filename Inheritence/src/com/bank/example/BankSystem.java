package com.bank.example;
class SavingAccount extends Account{
	double interstRate;
	double _dummyBalance;
	public void getVerify() {
		_dummyBalance = verification();
	}
	
	public SavingAccount(double _balance , float _rateofInterest) {
		 super(_balance);
		 this.interstRate = _rateofInterest;
	}
	
	public void calculateInterest() {
		if(_dummyBalance ==_tempBalance) {
			double _intrest = (_tempBalance*interstRate)/100;
			System.out.println("Interset Earn "+_intrest);
		}
		else {
			System.out.println("Amount Not Matched");
		}
	}
}

public class BankSystem{
     public static void main(String[] args) {
    	 SavingAccount user1 = new SavingAccount(70000, 5.2f);
    	 user1.getVerify();
    	 user1.showBalance();
    	 user1.calculateInterest();
    	 
	}
}
