package com.multiple.inheritence;

// Multiple inheritance is not allowed
// Because ambiguity

class Account{
	public void openAccount() {
		System.out.println("openAccount, Open Account.....");
	}
}

class SavingAccount extends Account{
	public void openAccount() {
		System.out.println("openAccount, Saving Account.....");
	}
	public void showMessage() {
		System.out.println("Open Account");
	}
}


class CurrentAccount extends Account{
	public void openAccount() {
		System.out.println("openAccount, Current Account.....");
	}
}
 
class AccountDetails extends SavingAccount { // CurrentAccount not allowed
	
}

public class AxisBank {
     public static void main(String[] args) {
    	 CurrentAccount user1 = new CurrentAccount();
    	 SavingAccount user2 = new SavingAccount();
    	 user1.openAccount();
    	 user2.showMessage();
	}
}
