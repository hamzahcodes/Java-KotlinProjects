package FoodOrderApp;

public class Menu {
	byte menuID;
	String menuName;
	int price;
	String description;
	byte quantity;
	
	static String restaurantName = "Wow Foods";
	
	Menu(byte id, String name, int charge) {
		menuID = id;
		menuName = name;
		price = charge;
	}
	
	static Menu[] getSnacksMenuCard(Menu[] menu) {		
		menu[0] = new Menu((byte)1, "Sandwich", 100);
		menu[1] = new Menu((byte)2, "Pizza", 200);
		menu[2] = new Menu((byte)3, "Burger", 150);
		menu[3] = new Menu((byte)4, "Fries", 90);
		menu[4] = new Menu((byte)5, "Coffee", 50);
		menu[5] = new Menu((byte)6, "Tea", 30);
		return menu;
	}
	
	static Menu[] getMealMenuCard(Menu[] menu) {		
		menu[0] = new Menu((byte)1, "Biryani", 300);
		menu[1] = new Menu((byte)2, "Fried Rice", 250);
		menu[2] = new Menu((byte)3, "Noodles", 220);
		menu[3] = new Menu((byte)4, "Soup", 120);
		menu[4] = new Menu((byte)5, "Dal Khichdi", 150);
		menu[5] = new Menu((byte)6, "Thali", 120);
		return menu;
	}
	

	
	static void displayMenu(Menu[] menu) {
		System.out.println("SrNo\tItemName\tPrice");
		for(int i = 0; i < 6; i++) {
			if(menu[i].menuName == "Sandwich") {
				System.out.println(menu[i].menuID + "\t" + menu[i].menuName + "\t" + (byte)menu[i].price);			
			} else {
				System.out.println(menu[i].menuID + "\t" + menu[i].menuName + "\t\t" + (byte)menu[i].price);
			}
		}
		
	}
}
