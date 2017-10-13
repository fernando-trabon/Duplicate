package practicaltask.practicaltask4.task4;

public class Product {
	private String name;
	private double price;
	private int quantity;

	// constructors
	
	public Product(String name) {
		this.name = name;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Two objects for saving objects witch have maxPrice and maxQuantity
	
	private static Product maxPrice = new Product("maxprice", 0.00, 0);
	private static Product maxQuantity = new Product("maxQuantity", 0.00, 0);

	// Getters and Setters
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
		maxValue();
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		maxValue();
	}

	public void maxValue() {
		if (this.price > maxPrice.price) {
			maxPrice = this;
		}
		if (this.quantity > maxQuantity.quantity) {
			maxQuantity = this;
		}

	}

	static public void printMaxPrice() {
		System.out.println("The most expensive item: " + maxPrice.name + " and quantity: " + maxPrice.quantity);
	}

	static public void printMaxQuantity() {
		System.out.println("The item wich has the biggest quantity is: " + maxQuantity.name);
	}
}
