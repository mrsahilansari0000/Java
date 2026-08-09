
public class OrderProcess extends OrderNotifications {

	public void selectMenu() {
		System.out.println("Item Add To Cart Successfully");
	}
	
	public void confirmOrder() {
		System.out.println("Order Placed Successfully");
		generateMail("sumit@gamil.com", "Order Placed");
		generateSms("8574125896");
	}
	
	

}
