package com.iibsib;

// IIB --> Instance Initialization Block
// SIB --> Static Initialization Block

// IIB Called when Object is Created. When We Create 20 Object then IIB Execute 20 Times
// SIB Called when class is loaded. It run One time at a time.


public class IibSib {
	
//	
//	{
//		System.out.println("IIB Called");
//		
//	}
//	
//	{
//		System.out.println("IIB1 Called");
//		
//	}
	
	
	static {
		
		System.out.println("SIB Called1");
	}
    static {
		
		System.out.println("SIB Called2");
	}
	
	
	public IibSib(){
		System.out.println("Constructor Inside IibSib ");
	}
	
	public IibSib(int amount){
		System.out.println("Constructor Inside IibSib "+amount);
	}
	
   static {
		
		System.out.println("SIB Called3");
	}
	
     public static void main(String[] args) {
    	 System.out.println("Main Method Called");
    	 IibSib iib = new IibSib();
    	 IibSib iib1 = new IibSib(25);
    
	}
    
}
