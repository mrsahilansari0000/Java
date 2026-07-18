package com.banksystem.exp1;
abstract class DigitalService{
	
	public abstract void upiPayment();
	public abstract void mobileRecharge();
	public abstract void waterBill();
	public abstract void movieTicket();
	public abstract void fastTagRecharge();
	
	public void qrScan(){
		System.out.println("DigitalService.qrScan()");
	}
	
	public void login() {
		System.out.println("DigitalService.login()");
	}
	
	DigitalService(){
		super();
		System.out.println("DigitalService.DigitalService()");
	}
}

class Paytm extends DigitalService{

	@Override
	public void upiPayment() {
		System.out.println("Paytm.upiPayment()");
		
	}

	@Override
	public void mobileRecharge() {
		System.out.println("Paytm.mobileRecharge()");
	}

	@Override
	public void waterBill() {
		System.out.println("Paytm.waterBill()");
	}

	@Override
	public void movieTicket() {
	System.out.println("Paytm.movieTicket()");
		
	}

	@Override
	public void fastTagRecharge() {
		System.out.println("Paytm.fastTagRecharge()");
		
	}
	
	Paytm(){
		super();
		System.out.println("Paytm.Paytm()");
	}
	
}


public class PaytmUser {
   public static void main(String[] args) {
	   Paytm user1 = new Paytm();
}
}
