package com.encapsulation.exp;

public class HelloWorld {
	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		AxisUser jp = new AxisUser();
		//System.out.println(jp.a);
		String name1 = "Hello";
		String name2 = "World";
		String fnl = name1.substring(0,3);
		System.out.println(fnl);
		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("Match");
		}
		else {
			System.out.println("Not Matched");
		}
		
	}
	
//	public void upiMethod() {
//		System.out.println("upiMethod.paytm()");
//		PaymentEngine paymentEngine = new PaymentEngine();
//		paymentEngine.paymentProcess();
//	}
//	
//	public void doPayment() {
//		System.out.println("Payment Under Process......");
//		
//	}
}

