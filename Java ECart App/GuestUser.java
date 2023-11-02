package ECart;

public class GuestUser implements Billing{
	float discountPercentage = 25;

	@Override
	public void orderPayment(float total) {
		System.out.println("Your Total payment is: " + total);
		
		
	}
}
