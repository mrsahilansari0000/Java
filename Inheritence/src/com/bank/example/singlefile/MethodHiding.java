package com.bank.example.singlefile;
class Method{
	public static void methodHiding() {
		System.out.println("Method.methodHiding()");
	}
}

class Hinding extends Method{
public static void methodHiding() {
		System.out.println("Hinding.methodHiding()");
	}
}
public class MethodHiding {
   public static void main(String[] args) {
	   Method x = new Hinding();
	   x.methodHiding();
}
}
