package FoodOrderApp;

public class Address {
	String street, city, country;
	
	Address(String street, String city, String country) {
		this.street = street;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
	}
	
}
