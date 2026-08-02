package com.covarientreturn.type;
class PaymentSystem{
	public GenericResponse Payment() {
		return new GenericResponse();
	}
}

class UPI extends PaymentSystem{
	  @Override
      public UPIResponse Payment() {
		  return new UPIResponse();
	}
}



public class Driver {
  public static void main(String[] args) {
	  UPI upi = new UPI();
	  upi.Payment();
}
}
