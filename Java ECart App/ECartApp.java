package ECart;

import java.util.Scanner;
import java.util.*;
import ECart.Aggregations.Address;
import ECart.Aggregations.Name;

public class ECartApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		User[] users = new User[3];
		ArrayList<User> users = new ArrayList<>();
		User.getUsers(users);
		
		System.out.print("Do you want to SignUp or Login (S/L): ");
		String enter = sc.next().toLowerCase();
		int login = -1, signup = -1;
		
		if(enter.equals("s")) {
			System.out.print("Enter your Full Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			String[] userName = name.split(" ");
			
			System.out.print("Enter phone no.: ");
			long phone = sc.nextLong();
			
			System.out.print("Enter your address: ");
			sc.nextLine();
			String add = sc.nextLine();
			String addr[] = add.split(" ");
			
			System.out.print("Enter your Password: ");
			String password = sc.next();
			
			users.add(new User(userName[0], password, new Name(userName[0], userName[1], userName[2]), phone, 
					new Address(addr[0], addr[1], addr[2], addr[3])));
				
			signup = users.size() - 1;
			
		} else if(enter.equals("l")) {
			Login l = new Login();
			login = l.validateUser(users);			
		} else {
			System.out.println("Please enter (S/L)");
			System.exit(1);
		}
		
		if(login != -1 || signup != -1) {
			int index = (login != -1) ? login : signup;
			String welcome = (login != -1) ? "Welcome, " + users.get(index).userName.toString() : "Welcome back, " + users.get(index).userName.toString();
			System.out.println(welcome);
			
			Product[] products = new Product[10];
			Product.displayProducts(products);
			
			int counter = 0, price = 0;
			String buy = "y";
			Order orders[] = new Order[10];
			
			do {
				System.out.print("\nPlease Enter your Choice and Quantity : ");
				int choice = sc.nextInt();
				int quantity = sc.nextInt();
				
				orders[counter] = new Order((byte)choice, products[choice - 1].productName, (byte)quantity, products[choice - 1].productCategory, (quantity * products[choice - 1].productPrice));
				price += (quantity * products[choice - 1].productPrice); 
				counter += 1;
				System.out.print("Do you want to buy more (Y / N): ");
				buy = sc.next().toLowerCase();
			} while(buy.equals("y"));
			
			if(login != -1) {
				PremiumUser p = new PremiumUser();
				p.orderPayment(price);	
			} else {
				GuestUser g = new GuestUser();
				g.orderPayment(price);
			}
		} 

		sc.close();
	}
}
