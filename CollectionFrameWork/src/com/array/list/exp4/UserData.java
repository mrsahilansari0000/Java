package com.array.list.exp4;

import java.util.ArrayList;

public class UserData {
	static ArrayList<Blogger> userDetail = new ArrayList<Blogger>();
       private void dbConnection() {
    	   Blogger rahul = new Blogger("rahulsharma@gmail.com", "rahul@123");
    	   Blogger karan = new Blogger("karan@gmail.com", "karan@123");
    	   
    	   userDetail.add(rahul);
    	   userDetail.add(karan);
       }
        
       public void userLogin(String _email, String _pass) {
    	   dbConnection();
    	   for(int i=0; i<userDetail.size(); i++) {
    	   Blogger realTime = userDetail.get(i);
    	   String tempMail =  realTime.getEmailId();
    	   String tempPass = realTime.getPassword();
    	       if(_email.equals(tempMail) && _pass.equals(tempPass)) {
    	    	   Blog blog = new Blog();
    	    	   blog.writeBlog();
    	    	   break;
    	       }
    	   }
       }
     
}
