package com.random.practice;

public class TempratureCmd {
	static String day[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	static String resultData[] = new String[7];
	static String temp[] = new String[7];
  public static void main(String[] args) {
	  
	  for(int i=0; i<=6; i++) {
		   temp[i] = args[i];
	  }
	   
	  for(int i=0; i<=6; i++) {
		  int value = Integer.parseInt(args[i]);
		  if(value>30) {
			  resultData[i] = args[i];
		  }
	  }
	System.out.println("Temprature above 30 List Here");
	 
	for(int i=0; i<=6; i++) {
		 if(resultData[i]!=null) {
			 System.out.println(day[i]+" "+resultData[i]);
		 }
	 }
	
	
	
	
}
}
