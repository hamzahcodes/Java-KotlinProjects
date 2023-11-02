package ECart;

import java.util.*;
class InvalidLoginException extends Exception {
	String msg;
	InvalidLoginException(String msg) {
        super(msg);
        this.msg=msg;
    }
}

public class Login {
	String uName;
	String password;
	
	public Login() {
		super();
	}
	
	int validateUser(ArrayList<User> users) {
		int ind = -1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Username: ");
		this.uName = sc.next();
		System.out.print("Enter your Password: ");
		this.password = sc.next();
	
		for(int i = 0; i < users.size(); i++) {
			if(this.uName.equals(users.get(i).userID) && this.password.equals(users.get(i).userPassword)) {
				ind = i;
				break;
			}
		}
		try {
			if(ind == -1){
				throw new InvalidLoginException("Invalid Credentials. Please try logging in again!!");				        
			}
		} catch (InvalidLoginException invalidException) {
			System.out.println(invalidException);
		}
		return ind;
	}
}
