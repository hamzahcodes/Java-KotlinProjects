package ECart;

import ECart.Aggregations.Name;
import ECart.Aggregations.Address;
import java.util.ArrayList;

public class User extends SignUp {
	
	public User(String userID, String userPassword, Name userName, long userPhone, Address userAddress) {
		super(userID, userPassword, userName, userPhone, userAddress);
	}
	
	static void getUsers(ArrayList<User> users) {
		users.add(new User("john", "123", new Name("John","Smith", "Peterson"), 797634296342L, 
				new Address("MG Road", "Mumbai", "Maharashtra", "India")));
		
		users.add(new User("kevin", "123", new Name("Kevin", "Mark", "Zukerberg"), 98786676766L, 
				new Address("North St", "California", "Los Angeles", "USA")));
		
		users.add(new User("adam", "123", new Name("Adam", "Jefferson", "Zampa"), 87776676567L, 
				new Address("West side St", "Sydney", "", "Australia")));
	}
}
