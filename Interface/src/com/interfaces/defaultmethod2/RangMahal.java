package com.interfaces.defaultmethod2;

public class RangMahal implements LuxuryHotels {

	@Override
	public void luxuryRooms() {
		System.out.println("RangMahal.luxuryRooms()");	
	}

	@Override
	public void comboRooms() {
        System.out.println("RangMahal.comboRooms()");
	}

	@Override
	public void duluxRoom() {
		System.out.println("RangMahal.duluxRoom()");
	}

	@Override
	public void familyRooms() {
		System.out.println("RangMahal.familyRooms()");
	}

}
