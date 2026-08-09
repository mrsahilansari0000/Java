
public class GenerateInvoice extends OrderNotifications {
  public void generateInvoice(String _amount, String _gstNumber) {
	  System.out.println("Your Invoice");
	  System.out.println("GST Number "+_gstNumber);
	  System.out.println("Order Total Amount "+_amount);
	  generateMail("sumit@gamil.com", "Invoice Sent");
	  generateSms("8574125896");
  }
}
