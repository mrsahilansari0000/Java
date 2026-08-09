
class User{
	
	static int liveCount = 0;
	private String mobileNumber;
	
	public User(String string){
		this.mobileNumber = string;
	}
	
	{
		liveCount = liveCount+1;
	}
	
}


public class JioHotstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User("8574521458");
		User u2 = new User("8774521458");
		User u3 = new User("8974521458");
		User u4 = new User("9574521458");
		User u5 = new User("9074521458");
		User u6 = new User("6574521458");
		User u7 = new User("9874521458");
		User u8 = new User("8874521458");
		User u9 = new User("8774521458");
		User u10 = new User("8274521458");
		
		System.out.println("Total Live Watching: "+User.liveCount);
	}

}
