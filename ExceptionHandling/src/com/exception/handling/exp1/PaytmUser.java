package com.exception.handling.exp1;
class PaytmDataBase{
	
	private String upiId = "raju@paytm";
	private int upiPin = 7854;
	public String _tempUpiId;
	public int _tempUpiPin;
	
	public void accessDataBase() {
		this._tempUpiId  = upiId;
		this._tempUpiPin = upiPin;
	}
	
}


class Paytm{
	public String upiId;
	public String upiPin;
	
	public Paytm(String upiId, String upiPin) {
		super();
		this.upiId = upiId;
		this.upiPin = upiPin;
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	public String getUpiPin() {
		return upiPin;
	}

	public void setUpiPin(String upiPin) {
		this.upiPin = upiPin;
	}
	
	
}


public class PaytmUser {
 public static void main(String[] args) {
	 PaytmDataBase database = new PaytmDataBase();
	 database.accessDataBase();
	 Paytm paytm;
	 
	 try {
		 paytm = new Paytm("raju@paytm", "7874");
		 int pin = Integer.parseInt(paytm.upiPin);
		 if(database._tempUpiId.equals(paytm.upiId) && database._tempUpiPin==pin) {
			 System.out.println("Payment Done");
		 }
		 else {
			 System.out.println("Payment Failed");
		 }
	 }
	 
	 catch (Exception e){
		 e.printStackTrace();
	 }
	 
}
}
