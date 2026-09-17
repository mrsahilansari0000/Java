package com.staticinstance;

public class CarDiscount {
	int carAmount = 812000;
	
	public int dicount() {
		int discountRate = 5;
		int discount = (carAmount*discountRate)/100;
		int finalAmount = carAmount-discount;
		System.out.println("You Got "+discount+" Discount on "+carAmount);
		System.out.println("please Pay "+finalAmount);
		return discount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarDiscount brezzaLxi = new CarDiscount();
		brezzaLxi.dicount();
		boolean a = true;
		boolean b = false;
		System.out.println(a&&b);
	}

}
