package practicaltask.praticaltask4.task4;

public class AppProduct {

	public static void main(String[] args) {
		
		Product product1 = new Product("Sugar", 23.20, 4);
		product1.maxValue();
		Product product2 = new Product("Solt", 8.40, 20);
		product2.maxValue();
		Product product3 = new Product("Tomat", 27.20, 4);
		product3.maxValue();
		Product product4 = new Product("Pasta", 11, 7);
		product4.maxValue();
	
		Product.printMaxPrice();
		Product.printMaxQuantity();
		
		System.out.println("-------------------------------------------------");
		
		product2.setPrice(28);
		product4.setQuantity(78);
		
		Product.printMaxPrice();
		Product.printMaxQuantity();
		
		
	}

}
