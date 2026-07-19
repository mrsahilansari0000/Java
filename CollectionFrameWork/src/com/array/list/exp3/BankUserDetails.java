package com.array.list.exp3;

import java.util.ArrayList;
import java.util.Scanner;

public class BankUserDetails {
	 static Scanner sc = new Scanner(System.in);
	 static ArrayList<AxisBank> userDetails = new ArrayList<AxisBank>();
    public void UserData() {
    	
         AxisBank rahulSharma = new AxisBank("Rahul Sharma", "471285748965", "AXIG0", "Kalwar", "25000");
         AxisBank priyaPatel = new AxisBank("Priya Patel", "638492761054", "AXIM1", "Jaipur", "45200");
         AxisBank amitKumar = new AxisBank("Amit Kumar", "529174836291", "AXID2", "Delhi", "890");
         AxisBank snehaGupta = new AxisBank("Sneha Gupta", "784561239874", "AXIB3", "Mumbai", "12500");
         AxisBank vikashSingh = new AxisBank("Vikash Singh", "365498721056", "AXIP4", "Pune", "670");
         AxisBank anjaliVerma = new AxisBank("Anjali Verma", "917463820154", "AXIC5", "Chennai", "38900");
         AxisBank rohanMehta = new AxisBank("Rohan Mehta", "482715936047", "AXIG6", "Bangalore", "2100");
         AxisBank nehaJain = new AxisBank("Neha Jain", "603928571469", "AXIH7", "Hyderabad", "500");
         AxisBank saurabhYadav = new AxisBank("Saurabh Yadav", "175849362108", "AXIK8", "Kolkata", "27500");
         AxisBank poojaSharma = new AxisBank("Pooja Sharma", "294761835920", "AXIM9", "Ahmedabad", "15800");
         AxisBank arjunReddy = new AxisBank("Arjun Reddy", "836291745603", "AXIT0", "Hyderabad", "32000");
         AxisBank kavitaRao = new AxisBank("Kavita Rao", "571093846275", "AXIB1", "Bangalore", "750");
         AxisBank manishThakur = new AxisBank("Manish Thakur", "940582761394", "AXID2", "Lucknow", "18900");
         AxisBank ritikaSingh = new AxisBank("Ritika Singh", "628374910572", "AXIG3", "Jaipur", "45600");
         AxisBank deepakJoshi = new AxisBank("Deepak Joshi", "317485920163", "AXIP4", "Indore", "920");
         AxisBank simranKaur = new AxisBank("Simran Kaur", "759284631045", "AXIC5", "Chandigarh", "26700");
         AxisBank rajeshMalhotra = new AxisBank("Rajesh Malhotra", "481739256084", "AXIM6", "Delhi", "13400");
         AxisBank tanviMehra = new AxisBank("Tanvi Mehra", "602194837516", "AXIH7", "Mumbai", "450");
         AxisBank harshVerma = new AxisBank("Harsh Verma", "935671482093", "AXIK8", "Pune", "31200");
         AxisBank muskanBansal = new AxisBank("Muskan Bansal", "174829365701", "AXIG9", "Kolkata", "7800");
         
 
        	 userDetails.add(rahulSharma);
        	 userDetails.add(priyaPatel);
        	 userDetails.add(amitKumar);
        	 userDetails.add(snehaGupta);
        	 userDetails.add(vikashSingh);
        	 userDetails.add(anjaliVerma);
        	 userDetails.add(rohanMehta);
        	 userDetails.add(nehaJain);
        	 userDetails.add(saurabhYadav);
        	 userDetails.add(poojaSharma);
        	 userDetails.add(arjunReddy);
        	 userDetails.add(kavitaRao);
        	 userDetails.add(manishThakur);
        	 userDetails.add(ritikaSingh);
        	 userDetails.add(deepakJoshi);
        	 userDetails.add(simranKaur);
        	 userDetails.add(rajeshMalhotra);
        	 userDetails.add(tanviMehra);
        	 userDetails.add(harshVerma);
        	 userDetails.add(muskanBansal);

	}
    
    public void sendMinBalNotification() {
    	for(int i=0; i<userDetails.size(); i++) {
			AxisBank user = userDetails.get(i);
   		 String bal = user.getBalance();
   		 int balance = Integer.parseInt(bal);
   		 if(balance<user.MIN_BAL) {
   			 System.out.println(" sending email to user " + user.getHolderName() + " as his/her balance is not maintained");
   		 }
   	 }
    }
    
    public void getDetails(){
    	System.out.println("Enter The Account Number");
    	String accNo = sc.nextLine();
    	for(int i=0; i<userDetails.size(); i++) {
    		AxisBank user = userDetails.get(i);
    		if(user.getAccountNumber().equals(accNo)){
    			String name = user.getHolderName();
    			String acc = user.getAccountNumber();
    			String ifsc = user.getIfscCode();
    			String branch = user.getBrachName();
    			String bal = user.getBalance();
    			System.out.println("Account Holder Name: "+name);
    			System.out.println("Account Number: "+acc);
    			System.out.println("IFSC Code: "+ifsc);
    			System.out.println("Branch Name: "+branch);
    			System.out.println("Account Balance: "+bal);
    			break;
    		}
    	}
    }
    
}

