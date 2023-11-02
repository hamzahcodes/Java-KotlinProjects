package FoodOrderApp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Restaurant {
	String gstNo;
	String restaurantName;
	Address restaurantAddress;
	long phoneNo;
	
	Restaurant(String gst, String name, Address add, long phone) {
		gstNo = gst;
		restaurantName = name;
		restaurantAddress = add;
		phoneNo = phone;
	}
	
	void display() {
		System.out.println("\n------- Welcome to " + this.restaurantName + " --------");
		System.out.println("Address: " + this.restaurantAddress);
		System.out.println("\nPhone: " + this.phoneNo + "      GST No: " + this.gstNo);
		System.out.println("\t\tBill No: 11970  ");
		System.out.print("Date: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("\tTime: " + LocalTime.now().toString().substring(0, 8));
	}
}
