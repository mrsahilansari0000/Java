package com.custom.exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

class SearchException extends Exception {
	public SearchException(String expMessage) {
           super(expMessage);
	}

}

public class SearchData {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
          int element[]= {10,25,5,41,2,3,65,15,30,35};
          int searchElement;
          boolean status=false;
          System.out.println("Enter The Searching Element");

          try {
        	  searchElement = sc.nextInt();
        	  for(int i=0; i<element.length; i++) {
        		  if(element[i]==searchElement) {
        			  System.out.println("Element Found At: "+i+" Position");
        			  status=true;
        			  break;
        		  }		 
        	  }
        	  
        	  if(!status) {
        		  throw new SearchException("Element Not Found");
            	  
        	  }	 
          }
          catch (InputMismatchException e) {
			e.printStackTrace();
		}
        
          catch (SearchException e) {
			System.err.println(e.getMessage());
		}
          catch(Exception e) {
        	  e.printStackTrace();
          }
          
          
	}
}
