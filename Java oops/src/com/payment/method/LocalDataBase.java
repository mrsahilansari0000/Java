package com.payment.method;

public class LocalDataBase {
	private String upiId = "8745214785@ybl";
    private int upiPin = 7825;
    private String mobileNumber = "8888888888";
    private String qrCode = "#&%^$";
     public String _tempUpiId;
     public int _tempUpiPin;
     public String _tempMobileNumber;
     public String _tempQrCode;
     public void accessDataBase( ) {
    	 _tempUpiId = upiId;
    	 _tempUpiPin = upiPin;
    	 _tempMobileNumber = mobileNumber;
    	 _tempQrCode = qrCode;
    	 
     }
}
