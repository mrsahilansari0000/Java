package com.bank.account;

public interface BankAccount {
        public static final double MIN_BAL = 1000;
        
        public abstract void deposit(double amount);
        public abstract void withdrawl(double amount);
        public abstract void checkBalance();
        
}
