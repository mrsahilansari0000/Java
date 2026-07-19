package com.amazon.platform;

public interface Ecommerce {
    public abstract boolean login(String upiId, int upiPin);
    public abstract boolean upi(String upiId, int upiPin);
    public abstract String getStatus();
}
