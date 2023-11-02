package ECart;

public class Order {
	byte orderID;
	String itemName;
	int price;
	byte quantity;
	String category;
	
	public Order(byte orderID, String itemName, byte quantity, String category, int price) {
		this.itemName = itemName;
		this.quantity = quantity;
		this.category = category;
		this.price = price;
		this.orderID = orderID;
	}

	static void display(Order[] orders, int counter) {
		
		System.out.println("------------------------------Your Cart--------------------------------");  
		System.out.printf("%10s %20s %20s %15s %10s", "Product ID", "Product Category", "Product Name", "Quantity", "Price");  
		System.out.println();  
		System.out.println("-----------------------------------------------------------------------");  
		for(int i = 0; i < counter; i++ ) {  
			System.out.format("%10s %20s %20s %15s %10s", orders[i].orderID, orders[i].category,orders[i].itemName, orders[i].quantity, orders[i].price);  
			System.out.println();  
		}  
		System.out.println("-----------------------------------------------------------------------");  
		
	}
}
