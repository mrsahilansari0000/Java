import java.util.Scanner;

public class SendEmail {
	static String userEmail;
	static String receiverMail;
	static String message;
	public void sendEmail(String reipient, String message, String user) {
		 System.out.println("Sending Email........");
		 System.out.println("Email Sent Successfully");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SendEmail rahul = new SendEmail();
		// TODO Auto-generated method stub
          System.out.print("From: ");
          userEmail = sc.nextLine();
          System.out.print("To: ");
          receiverMail = sc.nextLine();
          System.out.print("Message: ");
          message = sc.nextLine();
          rahul.sendEmail(userEmail, receiverMail, message);
	}

}
