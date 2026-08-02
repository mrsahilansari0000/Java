package com.marker.interfaces5;

public class MarkerInterface implements Cloneable {

	  public void getMessage(Object obj) {
		  System.out.println("MarkerInterface.getMessage()"+obj);
	  }
	
	   @Override
	   public MarkerInterface clone() throws CloneNotSupportedException{
		return (MarkerInterface) super.clone();
		   
	   }
	  public static void main(String[] args) throws CloneNotSupportedException {
		  
		 MarkerInterface user1 = new MarkerInterface();
		 MarkerInterface user2 = (MarkerInterface) user1.clone();
		 
		 user1.getMessage(user1);
		 user2.getMessage(user2);
		  
	}
	
	
}
