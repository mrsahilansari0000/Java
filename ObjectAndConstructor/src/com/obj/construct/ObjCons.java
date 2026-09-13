package com.obj.construct;

public class ObjCons {
    // Constructor is used for initialize the State of OBJ
	// Every Obj have its own Copy
	int orderId;
	int pinCode;
	int quantity;
	
	public ObjCons() {
		System.out.println("Default Constructor ObjCons().... ");
	}
	public ObjCons(int a, int b) {
		int sum = a+b;
		System.out.println("Sum "+sum);
	}
	
	public ObjCons(int m, int n, int o) {
		 this.orderId = m;
		 this.pinCode = n;
		 this.quantity = o;
	}
	
	public static void main(String[] args) {
		ObjCons obj1 = new ObjCons();
		ObjCons obj2 = new ObjCons(25,25);
		ObjCons obj3 = new ObjCons(452, 302012, 3);
		System.out.println("Order Id: "+obj3.orderId);
		System.out.println("Pin Code: "+obj3.pinCode);
		System.out.println("Quantity: "+obj3.quantity);
	}

}
