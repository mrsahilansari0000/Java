package com.exception.handling.exp2;

import java.util.InputMismatchException;
import java.util.Scanner;

class Data{
	static int values[] = new int[5];
	Scanner sc = new Scanner(System.in);
	
	public void setItems() {
		System.out.println("Enter the Values");
		try {
			for(int i=0; i<values.length; i++) {
				values[i]=sc.nextInt();
			}
		}
		
		catch (InputMismatchException e) {
			e.printStackTrace();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
//		catch (InputMismatchException e) {
//			// TODO: handle exception
//		}
		
	}
	
	public void getItems() {
		System.out.println("Values Are: ");
		for(int i=0; i<values.length; i++) {
			
			System.out.print(values[i]+" ");
		}
		
	}
}


public class User {
      public static void main(String[] args) {
    	  Data user = new Data();
    	  user.setItems();
    	  user.getItems();
	}
}
