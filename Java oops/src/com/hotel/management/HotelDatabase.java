package com.hotel.management;

public class HotelDatabase {
     private StringBuilder userName[] = new StringBuilder[5];
     private StringBuilder userPassword[] = new StringBuilder[5];
     public StringBuilder tempUserName[] = new StringBuilder[5];
     public StringBuilder tempUserPassword[] = new StringBuilder[5];
     
     public void storeDataBase(StringBuilder _email, StringBuilder _password) {
    	 for(int i=0; i<userName.length; i++) {
    		 if(userName[i]!=null && userPassword[i]!=null){
        		 continue;
        	 }
    		 else {
    			 userName[i] = _email;
    			 userPassword[i] = _password;
    		 }
    		
    	 }
     }
     
     public void accessDataBase() {
		 for(int i=0; i<userName.length; i++) {
    		 tempUserName[i] = userName[i];
    		 tempUserPassword[i] = userPassword[i];
    	 }
	 }
     
}
