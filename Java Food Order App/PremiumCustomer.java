package FoodOrderApp;

public class PremiumCustomer extends Customer implements Bill {
	float discount = 12.5f;
	int deliveryCharges = -100;
	float membershipCardDiscount = 7.5f;
	static String type = "Premium Customer";
	
	PremiumCustomer(byte customerID, Name customerName, long customerPhone, Address customerAddress, String customerEmail) {
		super(customerID, customerName, customerPhone, customerAddress, customerEmail);
	}
	
	public void payBill(float total) {
		System.out.println("\tTotal Price is: " + total);
		System.out.println("\n\tSince you are our " + PremiumCustomer.type);
		float billAmount = (total - (total * discount / 100)) + deliveryCharges +
				(total - (total * membershipCardDiscount / 100));
		System.out.println("\tAfter Discount: " + billAmount);
	}
}
