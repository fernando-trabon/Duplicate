package homework.lesson1;

//Calculating circle perimeter and area by radius
//Skrypets O

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input circle radius:");
		try {
			double radius = Double.parseDouble(br.readLine());
			System.out.printf("Perimeter of flower bed is: " + "%.2f", (2 * Math.PI * radius));
			String format = "%.2f";
			System.out.printf("\nThe area of flower bad is: " + format, Math.PI * Math.pow(radius, 2));
		} catch (NumberFormatException | IOException e) {
			System.err.println(e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.err.print(e);
			}
		}
	}

}
