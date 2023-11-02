package FoodOrderApp;

public class Customer {
	byte customerID;
	Name customerName;
	Address customerAddress;
	long customerPhone;
	String customerEmail;
	
	Customer (byte id, Name name, long phone, Address address, String email) {
		this.customerID = id;
		this.customerName = name;
		this.customerAddress = address;
		this.customerPhone = phone;
		this.customerEmail = email;
	}
	
	void display() {
		System.out.println(customerID + "\t" + customerName + "\t" + customerPhone + "\t" + customerAddress + "\t" + customerEmail);
	}
	
}


