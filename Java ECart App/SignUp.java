package ECart;

import ECart.Aggregations.Address;
import ECart.Aggregations.Name;

public class SignUp {
	
	String userID;
	String userPassword;
	Name userName;
	long userPhone;
	Address userAddress;
	
	public SignUp(String userID, String userPassword, Name userName, long userPhone, Address userAddress) {
		super();
		this.userID = userID;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
	}
	
	
}
