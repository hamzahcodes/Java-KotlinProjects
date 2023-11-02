package FoodOrderApp;

public class GuestCustomer extends Customer implements Bill {
	static String type = "Guest Customer";
	
	GuestCustomer(byte customerID, Name customerName, long customerPhone, Address customerAddress, String customerEmail) {
		super(customerID, customerName, customerPhone, customerAddress, customerEmail);
	}
	public void payBill(float total) {
		System.out.println("\tTotal Price is: " + total);
		System.out.println("\n\tSince you are our " + GuestCustomer.type);
		System.out.println("\tAfter Discount: " + total);
	}
}
