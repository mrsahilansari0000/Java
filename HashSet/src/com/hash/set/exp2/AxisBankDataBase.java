package com.hash.set.exp2;

import java.util.HashSet;
import java.util.Iterator;

public class AxisBankDataBase {
	boolean auth = false;
	 HashSet<AxisBank> userDetails = new HashSet<AxisBank>();
     private void getDb() {
    	 AxisBank rahul = new AxisBank("rahulsharma@axis", "rahul@567", 25000);
    	 AxisBank pooja = new AxisBank("poojasony@axis", "pooja@777", 50000);
    	 AxisBank karan = new AxisBank("karanyadav@axis", "karan@2145", 70000);
    	 
    	 userDetails.add(rahul);
    	 userDetails.add(pooja);
    	 userDetails.add(karan);
    	 
    	// System.out.println(rahul.hashCode());
    	 int hash = "rahulsharma@axis".hashCode();
    	 hash = hash ^ (hash >>> 6);
    	 int bucketIndex = hash & (16 -1);
    	 System.out.println(bucketIndex);
     }
     
     public boolean logIn(String id, String pass) {
    	 getDb();
       Iterator<AxisBank> itr = userDetails.iterator();
       while(itr.hasNext()) {
    	   AxisBank check = itr.next();
    	   if(id.equals(check.getUserId())&&pass.equals(check.getPass())) {
    		   auth = true;
    		   break;
    	   }
       }
    		 
    		 
    	 return auth;
     }
     
//     public boolean testLogin(String id, String pass) {
//    	 for(int i=0; i<userDetails.size(); i++) {
//    		 AxisBank check = (AxisBank) userDetails.iterator();
//    		 if(id.equals(check.getUserId())&&pass.equals(check.getPass())) {
//      		   auth = true;
//      		   break;
//      	   }
//    	 }
//    	 return auth;
//     }
}
