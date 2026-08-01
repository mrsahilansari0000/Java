package com.hash.set.exp4;

class Account{
	String accountHolder;

	public Account(String accountHolder) {
		super();
		this.accountHolder = accountHolder;
	}
	
	@Override
	public int hashCode() {
		return 4322189;
	}
	
	@Override
	public boolean equals(Object obj2)
	{
		Account acc = (Account) obj2;
		return this.accountHolder.equals(acc.accountHolder);
	}
	
}


public class Driver {
    public static void main(String[] args) {
    	
    	// Contract1: If two object are equal then hash Code Must be same.
		String s1 = "Kodewala";
		String s2 = "Kodewala";
		
		System.out.println(s1.hashCode()+" = "+s2.hashCode());
		
		// Contract2: If two object return same hasCode, Object may or may not be equal
		Account user1 = new Account("Rahul Sharma");
		Account user2 = new Account("Rahul Sharma");
		Account user3 = new Account("Pooja Sony");
		
		System.out.println(user1.hashCode()+" and "+user2.hashCode()+" is user1 and user2 equal ? " +user1.equals(user2));
		
    	
	}
}
