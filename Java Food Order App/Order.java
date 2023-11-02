package FoodOrderApp;

public class Order {
	byte orderID;
	byte quantity;
	String itemName;
	
	public Order(byte orderID, String itemName, byte quantity) {
		this.itemName = itemName;
		this.quantity = quantity;
		this.orderID = orderID;
	}

	static void display(Order[] orders, int counter) {
		
		System.out.println("------------------------------Your Cart--------------------------------");  
		System.out.printf("%20s %20s %15s %10s", "Product ID", "Product Name", "Quantity");  
		System.out.println();  
		System.out.println("-----------------------------------------------------------------------");  
		for(int i = 0; i < counter; i++ ) {  
			System.out.format("%20s %20s %15s %10s", orders[i].orderID,orders[i].itemName, orders[i].quantity );  
			System.out.println();  
		}  
		System.out.println("-----------------------------------------------------------------------");  
		
	}
}
