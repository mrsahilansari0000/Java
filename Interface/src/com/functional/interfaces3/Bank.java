package com.functional.interfaces3;

@FunctionalInterface
public interface Bank {
    public abstract double calculateInterest(int amount, double rateOfInterest);
}
