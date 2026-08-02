package com.marker.interfaces2;

class Notification implements Sendable{
	 private String message = "Login Sucessfully";
	 public String ack = "Welcome To Application";
	 public void getMessage() {
		 System.out.println(message);
	 }
}

class Telegram{
	public void getNotification(Object obj) {
		Notification notify = (Notification) obj;
		  if(obj instanceof Notification) {
			  notify.getMessage();
			  System.out.println(notify.ack);
		  }
		  else {
			  System.out.println("You Cant Access The Message");
		  }
	}
}

public class TelegramUser {
   public static void main(String[] args) {
	   Notification messageToken = new Notification();
	   Telegram user = new Telegram();
	   user.getNotification(messageToken);
    }
}
