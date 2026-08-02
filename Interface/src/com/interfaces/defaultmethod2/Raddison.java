package com.interfaces.defaultmethod2;

public class Raddison implements LuxuryHotels{

	@Override
	public void luxuryRooms() {
		System.out.println("Raddison.luxuryRooms()");
		
	}

	@Override
	public void comboRooms() {
		System.out.println("Raddison.comboRooms()");
	}

	@Override
	public void duluxRoom() {
		System.out.println("Raddison.duluxRoom()");
	}

	@Override
	public void familyRooms() {
		System.out.println("Raddison.familyRooms()");
	}

}
