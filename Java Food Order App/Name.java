package FoodOrderApp;

public class Name {
	String fName, lName, midName;
	
	public String toString() {
		return this.fName + " " + this.midName + " " + this.lName;
	}
	
	Name(String fName, String midName, String lName) {
		this.fName = fName;
		this.midName = midName;
		this.lName = lName;
	}
}
