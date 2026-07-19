package com.array.list.exp6;

import java.util.ArrayList;

public class HotstarDatabase {
	private boolean auth = false;
	ArrayList<Hotstar> dbDetails = new ArrayList<Hotstar>();
     private void hotstarDb() {
    	 
    	  Hotstar rahul = new Hotstar("rahulkumar@gmail.com", "rahul@87#");
    	  Hotstar priya = new Hotstar("priyasharma@gmail.com", "Priya@1234");
    	  Hotstar amit = new Hotstar("amit.verma@yahoo.com", "Amit#5678");
    	  Hotstar sneha = new Hotstar("sneha.kumar@outlook.com", "Sneha@9876");
    	  Hotstar rahulverma = new Hotstar("rahulverma123@gmail.com", "Rahul$2025");
    	  Hotstar pooja = new Hotstar("pooja.mishra@hotmail.com", "Pooja#4567");
    	  Hotstar vikas = new Hotstar("vikaspatel@icloud.com", "Vikas@1111");
    	  Hotstar ananaya = new Hotstar("ananya.singh@gmail.com", "Ananya#7890");
    	  Hotstar rohit = new Hotstar("rohit.sharma95@yahoo.com", "Rohit@2525");
    	  Hotstar neha = new Hotstar("neha.gupta@outlook.com", "Neha$4321");
    	  
    	  dbDetails.add(rahul);
    	  dbDetails.add(priya);
    	  dbDetails.add(amit);
    	  dbDetails.add(sneha);
    	  dbDetails.add(rahulverma);
    	  dbDetails.add(pooja);
    	  dbDetails.add(vikas);
    	  dbDetails.add(ananaya);
    	  dbDetails.add(rohit);
    	  dbDetails.add(neha);
    	  
    	
     }
     
     public boolean getAuth(String id, String pass) {
    	 hotstarDb();
    	 for(int i=0; i<dbDetails.size(); i++) {
    		 Hotstar db = dbDetails.get(i);
    		 String fetchEmail = db.getEmail();
    		 String fetchPassword = db.getPass();
    		 if(fetchEmail.equalsIgnoreCase(id)&&fetchPassword.equalsIgnoreCase(pass)) {
    			 auth = true;
    			 break;
    		 }
    	 }
 
    	 return auth;
     }
     
//     public void printDb() {
//    	 for(int i=0; i<dbDetails.size(); i++) {
//    		 Hotstar  = dbDetails.get(i);
//    		 System.out.println(dbDetails.get(i));
//    	 }
//    	 
//     }
}
