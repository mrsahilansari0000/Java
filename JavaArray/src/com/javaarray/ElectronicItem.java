package com.javaarray;

public class ElectronicItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String product[] = {"Laptop","SmartPhone", "Tablet", "Television", "Washing Machine"};
         int price[] = {15000, 70000, 25000, 35000, 50000};
         String hello[] = new String[4]; 
         System.out.println(hello[3]);
         
         int maxPriceIndex = 0;
         
         for(int i = 1 ; i<price.length; i++) {
        	 if(price[i]>price[maxPriceIndex]) {
        		 maxPriceIndex = i;
        	 }
         }
         System.out.println("Item With Highest Price "+product[maxPriceIndex]+" "+price[maxPriceIndex]);
	}

}
