package FoodOrderApp;

public class RegularCustomer extends Customer implements Bill {
	
		float discount = 6.5f;
		int deliveryCharges = -50;
		static String type = "Regular Customer";
		
		RegularCustomer(byte customerID, Name customerName, long customerPhone, Address customerAddress, String customerEmail) {
			super(customerID, customerName, customerPhone, customerAddress, customerEmail);
		}
		
		public void payBill(float total) {	
			System.out.println("\tTotal Price is: " + total);
			System.out.println("\n\tSince you are our " + RegularCustomer.type);
			float billAmount = total - (total * discount / 100) + deliveryCharges;
			System.out.println("\tAfter Discount: " + billAmount);
		}
}
