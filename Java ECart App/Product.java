package ECart;


public class Product {
	String productName;
	int productPrice;
	String productCategory;
	int productQuantity;
	
	public Product(String productName, int productPrice, String productCategory, int productQuantity ) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.productQuantity = productQuantity;
	}
	
	static void displayProducts(Product[] products) {
		products[0] = new Product("IPhone 15", 150000, "Electronics", 15);
		products[1] = new Product("Benq Monitor", 90000, "Electronics", 20);
		products[2] = new Product("HP Laptop", 85000, "Electronics", 10);
		products[3] = new Product("Logitech KeyBoard", 2500, "Electronics", 30);
		products[4] = new Product("HP Mouse", 1000, "Electronics", 50);
		products[5] = new Product("T-Shirt", 1500, "Clothes", 100);
		products[6] = new Product("Nike Shoes", 6000, "Shoes", 25);
		products[7] = new Product("Cuttlery", 3300, "Utensils", 60);
		products[8] = new Product("Split AC", 66700, "Home Appliances", 10);
		products[9] = new Product("Java Programming", 3000, "Books", 70);
		
		
		System.out.println("-------------------------------------------------------------------------------");  
		System.out.printf("%10s %20s %20s %15s %10s", "Product ID", "Product Category", "Product Name", "Price", "Quantity");  
		System.out.println();  
		System.out.println("-------------------------------------------------------------------------------");
		int loop = 1;
		for(Product product: products) {  
			System.out.format("%10s %20s %20s %15s %10s", loop, product.productCategory, product.productName, product.productPrice, product.productQuantity);  
			System.out.println();  
			loop++;
		}  
		System.out.println("-------------------------------------------------------------------------------");  
	}
}
