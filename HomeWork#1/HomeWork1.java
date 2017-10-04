import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double radiusFlowerBed;
		String name;
		String address;
		double c1, c2, c3; // call price
		double t1, t2, t3; // call time
		
		// task #1.1
		
		System.out.println("Input radiusFlowerBed: ");
		radiusFlowerBed = Double.parseDouble(reader.readLine());
		System.out.println("Flower Bed's perimeter = " + String.format("%.2f",2*Math.PI*radiusFlowerBed) );
		System.out.println("Flower Bed's area = " + String.format("%.2f",Math.PI*radiusFlowerBed*Math.pow(radiusFlowerBed, 2)));
	
		// task #1.2
		
		System.out.println("What is your name? ");
		name = reader.readLine();
		System.out.println("Where are you live, " + name + "?");
		address = reader.readLine();
		System.out.println("Your name is - " + name + ". And you live in " + address + ".");
	
		// task #1.3
		
		System.out.print("Input c1, $/min:");
		c1 = Double.parseDouble(reader.readLine());
		System.out.print("Input c2, $/min:");
		c2 = Double.parseDouble(reader.readLine());
		System.out.print("Input c3, $/min:");
		c3 = Double.parseDouble(reader.readLine());
		System.out.print("Input t1, min:");
		t1 = Double.parseDouble(reader.readLine());
		System.out.print("Input t2, min:");
		t2 = Double.parseDouble(reader.readLine());
		System.out.print("Input t3, min:");
		t3 = Double.parseDouble(reader.readLine());
				
		
		
		System.out.println("Price of first call = " + String.format("%.2f", c1 * t1) + " $");
		System.out.println("Price of second call = " + String.format("%.2f", c2 * t2) + " $");
		System.out.println("Price of thirth call = " + String.format("%.2f", c3 * t3) + " $");
		
		System.out.println("Price of all calls = " + String.format("%.2f", (c1 * t1 + c2 * t2 + c3 * t3)) + " $");
		
	}

}
