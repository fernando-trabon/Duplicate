package homework.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Calculating international calls
// Skrypets O

public class Task3 {
	public static double checkNegative(double number) throws NegativeNumberException {
		if (number > 0) {
			return number;	
		} else {
			throw new NegativeNumberException("You inputted negative number!");
		}
		
		
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double country1 = 0, country2 = 0, country3 = 0;
		double time1 = 0, time2 = 0, time3 = 0;
		System.out.println(
				"Enter the cost per minute of the call from the first country, second country and third country:");
		try {
			country1 = checkNegative(Double.parseDouble(br.readLine()));
			country2 = checkNegative(Double.parseDouble(br.readLine()));
			country3 = checkNegative(Double.parseDouble(br.readLine()));
			System.out.println("Enter the time of the call from the first country, second country and third country:");
			time1 = checkNegative(Double.parseDouble(br.readLine()));
			time2 = checkNegative(Double.parseDouble(br.readLine()));
			time3 = checkNegative(Double.parseDouble(br.readLine()));
		} catch (NumberFormatException | IOException | NegativeNumberException e) {
			System.err.println(e);
		}
		System.out.printf("The cost of first call: " + "%.2f", country1 * time1);
		System.out.printf("\nThe cost of second call: " + "%.2f", country2 * time2);
		System.out.printf("\nThe cost of third call: " + "%.2f", country3 * time3);
		System.out.printf("\nThe cost of all calls: " + "%.2f", country1 * time1 + country2 * time2 + country3 * time3);
	}

}
