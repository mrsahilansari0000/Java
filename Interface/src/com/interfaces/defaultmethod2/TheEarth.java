package com.interfaces.defaultmethod2;

public class TheEarth implements LuxuryHotels{

	@Override
	public void luxuryRooms() {
		System.out.println("TheEarth.luxuryRooms()");
	}

	@Override
	public void comboRooms() {
		System.out.println("TheEarth.comboRooms()");
	}

	@Override
	public void duluxRoom() {
		System.out.println("TheEarth.duluxRoom()");
	}

	@Override
	public void familyRooms() {
		System.out.println("TheEarth.familyRooms()");
	}
	
	@Override
	public void singleRoom() {
		System.out.println("TheEarth.singleRoom()");
	}

}

class TheEarthUser{
	public static void main(String[] args) {
		TheEarth earth = new TheEarth();
		earth.singleRoom();
	}
}
