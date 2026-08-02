package com.interfaces.defaultmethod2;

public interface LuxuryHotels {
	
        public abstract void luxuryRooms();
        public abstract void comboRooms();
        public abstract void duluxRoom();
        public abstract void familyRooms();
        
        public default void singleRoom() {
        	System.out.println("Single Room");
        }
        
}
