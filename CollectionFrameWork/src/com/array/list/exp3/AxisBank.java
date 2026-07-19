package com.array.list.exp3;

public class AxisBank {
	private String holderName;
	private String accountNumber;
	private String ifscCode;
    private String brachName;
    private String balance;
    public int MIN_BAL = 1000;
    
    public AxisBank(String holderName, String accountNumber, String ifscCode, String brachName, String balance) {
		super();
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.brachName = brachName;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBrachName() {
		return brachName;
	}

	public void setBrachName(String brachName) {
		this.brachName = brachName;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
    
	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
}
