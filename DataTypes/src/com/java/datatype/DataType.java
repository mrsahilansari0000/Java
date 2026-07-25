package com.java.datatype;

public class DataType {
	int i;
	byte b;
	short s;
	long l;
	double d;
	String str;
	
	
      public static void main(String[] args) {
    	  DataType d = new DataType();
		  System.out.println(d.i);
		  System.out.println(d.b);
		  System.out.println(d.s);
		  System.out.println(d.l);
		  System.out.println(d.d);
		  System.out.println(d.str);
		  System.out.println(Byte.SIZE);
		  System.out.println(Short.SIZE);
	}
}

