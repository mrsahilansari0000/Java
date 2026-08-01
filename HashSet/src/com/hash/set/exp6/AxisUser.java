package com.hash.set.exp6;
import java.util.HashSet;
import java.util.Iterator;

class Axis {
	private double balance;
	private String bankAccount;
	private String accountHolder;

	public Axis(String bankAccount, String accountHolder, double balance) {
		super();
		this.balance = balance;
		this.bankAccount = bankAccount;
		this.accountHolder = accountHolder;
	}

	public double showBalance() {
		return balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void deposit(double amount) {
		if (balance >= 1000 && amount > 0) {
			this.balance = balance + amount;
		}
	}

	@Override
	public boolean equals(Object obj2) {
		Axis axis = (Axis) obj2;
		return this.accountHolder.equals(axis.accountHolder);
	}

}

public class AxisUser {
	public static void main(String[] args) {
		HashSet<Axis> axisData = new HashSet<Axis>();
		Axis rahulKumar = new Axis("45550200014785", "Rahul Kumar", 25000);
		Axis mohitSharam = new Axis("68860200012548", "Mohit Sharma", 25000);
		Axis poojaSony = new Axis("75560300047851", "Pooja Sony", 50000);
		Axis rahul = new Axis("95560100084526", "Rahul Kumar", 32000);

		axisData.add(rahulKumar);
		axisData.add(mohitSharam);
		axisData.add(poojaSony);
		axisData.add(rahul);
		System.out.println(rahulKumar.getAccountHolder().equals(mohitSharam.getAccountHolder()));
		System.out.println(rahulKumar.equals(rahul));
        
		System.out.println("Account Holder who Have 25000 Balance");
		Iterator<Axis> itr = axisData.iterator();
		while(itr.hasNext()) {
			Axis user = itr.next();
			if (user.showBalance() >= 25000) {
				System.out.println(user.getAccountHolder()+" : "+user.showBalance());
			}
		}

	}
}
