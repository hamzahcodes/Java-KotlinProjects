package ECart;
import java.util.Scanner;

public class PremiumUser implements Billing {
	float discount = 15f;

	@Override
	public void orderPayment(float total) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYour Total is: " + total);
		System.out.print("Do you have any Scratch cards OR coupons: (Y/N)");
		String res = sc.next().toLowerCase();
		String code = "";
		if(res.equals("y")) {
			System.out.print("Enter the code: ");
			code = sc.next();
		}
		System.out.println("Congrats!! This code allows 10% more discount.");
		float paymentRequired = 0.0f;
		
		paymentRequired = code == "" ? total - (total * discount / 100) :total - (total * discount / 100) - (total * 10 / 100);
		
		if(code.length() != 0) System.out.println("\nYour payment after applying code & discount is: " + paymentRequired);
		else System.out.println("\nYour payment after applying discount is: " + paymentRequired);
	}
}
