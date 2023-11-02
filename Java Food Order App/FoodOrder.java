package FoodOrderApp;
import java.util.Scanner;
import FoodOrderApp.Order;
public class FoodOrder {

	public static void main(String[] args) {
				
		RegularCustomer rc = new RegularCustomer((byte)1, new Name("John", "Smith", ""), 9823456713L, new Address("", "", ""), "john@gmail.com");
		PremiumCustomer pc = new PremiumCustomer((byte)2,  new Name("Mark", "Zuckerberg", "John"), 9876523324L, new Address("", "", ""),"mark34@gmail.com");
		GuestCustomer gc = new GuestCustomer((byte)3,  new Name("Kevin", "Adam", "Peterson"), 8655665232L, new Address("", "", ""), "kev7@gmail.com");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your ID: " );
		int ID = sc.nextInt();
		if(rc.customerID == ID) System.out.println("Welcome back, " + rc.customerName);
		else if(pc.customerID == ID) System.out.println("Welcome back, " + pc.customerName);
		else System.out.println("Welcome back, " + gc.customerName);
		
		System.out.print("\nDo you want Snacks or Meal (S/M): ");
		String foodType = sc.next().toLowerCase();
		Menu[] menu = new Menu[8];
		menu = foodType.equals("s") ? Menu.getSnacksMenuCard(menu) : Menu.getMealMenuCard(menu);
		Menu.displayMenu(menu);
		
		int counter = 0, price = 0, buy = 1;
		Order orders[] = new Order[10];
		
		do {
			System.out.print("\nPlease Enter your Choice and Quantity : ");
			int choice = sc.nextInt();
			int quantity = sc.nextInt();
			
			orders[counter] = new FoodOrderApp.Order((byte)choice, menu[choice - 1].menuName, (byte)quantity);
			price += (quantity * menu[choice - 1].price); 
			counter += 1;
			System.out.print("Do you want to buy more (0 / 1): ");
			buy = sc.nextInt();
		} while(buy != 0);
		
		Restaurant rs = new Restaurant("22AAYTRFG675", "Wow Foods", new Address("MG Road", "Mumbai", "India"), 98766238232L);
		rs.display();
		
		Order.display(orders, counter);
		if(ID == 1) rc.payBill(price); 
		else if(ID == 2) pc.payBill(price);
		else gc.payBill(price);
		sc.close();
	}
}
