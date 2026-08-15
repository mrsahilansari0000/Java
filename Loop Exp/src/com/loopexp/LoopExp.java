package com.loopexp;

public class LoopExp {

	public static void main(String[] args) {
		String cities[] = {"Chennai", "Banglore", "Delhi", "Ahemdabad", "Jaipur", "Mysore"};
		
		for(int i=0; i<cities.length; i++) {
			if(cities[i]=="Banglore") {
				System.out.print("City Banglore is Found At Index "+i);
				break;
			}
		}

	}	

}
