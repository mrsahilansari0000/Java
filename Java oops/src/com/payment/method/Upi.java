package com.payment.method;

import java.util.Scanner;

public class Upi extends LocalDataBase{
	UpiNotifications upiNotifications = new UpiNotifications();
	  Scanner sc = new Scanner(System.in);
      private String upiServer = "https://www.npci.org.in/product/upi";
      public String options[] = {"To Mobile Number", "To QrCode","To UpiId"};
      public void upiPayment() {
    	  accessDataBase();
    	  System.out.println("Choose Payment Option");
    	  for(int i=0; i<options.length; i++) {
    		  System.out.println(options[i]);
    	  }
    	  String _userSelectedOption = sc.nextLine();
    	 switch (_userSelectedOption) {
		case "To Mobile Number":
			System.out.println("Enter Mobile Number");
			String _mobile = sc.nextLine();
			System.out.println("Enter UpiPin");
			int _pin  = sc.nextInt();
			
			if( _mobile.equals(_tempMobileNumber) && _pin==_tempUpiPin && upiServer.equals("https://www.npci.org.in/product/upi")) {
				System.out.println("Connecting To Upi Gateway..");
				System.out.println("Payment Done");
				upiNotifications.upiNotification();
			}
			else {
				System.out.println("Invalid Details Payment Failed");
			}
			break;
			
        case "To QrCode":
			
        	System.out.println("Enter Qr Code");
			String _qr = sc.nextLine();
			System.out.println("Enter UpiPin");
			int _upipin  = sc.nextInt();
			
			if( _qr.equals(_tempQrCode) && _upipin==_tempUpiPin && upiServer.equals("https://www.npci.org.in/product/upi")) {
				System.out.println("Connecting To Upi Gateway..");
				System.out.println("Payment Done");
				upiNotifications.upiNotification();
			}
			else {
				System.out.println("Invalid Details Payment Failed");
			}
			break;
			
        case "To UpiId":
	
        	System.out.println("Enter Upi Id");
			String _upiID = sc.nextLine();
			System.out.println("Enter UpiPin");
			int _upipins  = sc.nextInt();
			
			if( _upiID.equals(_tempUpiId) && _upipins==_tempUpiPin && upiServer.equals("https://www.npci.org.in/product/upi")) {
				System.out.println("Connecting To Upi Gateway..");
				System.out.println("Payment Done");
				upiNotifications.upiNotification();
			}
			else {
				System.out.println("Invalid Details Payment Failed");
			}
			break;

		default:
			break;
		}
      }
      
}

class UpiNotifications extends Notification{
	public void upiNotification() {
		sendMail();
		sendSms();
	}
	
}
