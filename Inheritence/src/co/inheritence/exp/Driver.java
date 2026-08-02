package co.inheritence.exp;
class AxisBank{
	private int balance;
    int _balance;

	public void setBalance(int _amount) {
		this.balance = _amount;
		_balance = balance;
	}
	
	public void getBalance() {
		System.out.println(balance);
	}
}
class Upi extends AxisBank{
	public void show() {
		System.out.println(_balance);
	}
}

public class Driver {
    public static void main(String[] args) {
    	Upi upi = new Upi();
    	upi.setBalance(2500);
    	upi.getBalance();
	}
}
