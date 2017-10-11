package practicaltask.praticaltask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddNumbers {
	static int firstNumber, secondNumber, thirdnumber;
	static int totalOddNumbers = 0;
	
	// Odd numbers calculation method
	static void oddNumber(int number) {
		totalOddNumbers += ((number % 2) != 0 ? 1 : 0);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	System.out.println("You need input three numbers");
	System.out.println("Input first number: ");
	oddNumber(Integer.parseInt(reader.readLine()));
	System.out.println("Input second number: ");
	oddNumber(Integer.parseInt(reader.readLine()));
	System.out.println("Input third number: ");
	oddNumber(Integer.parseInt(reader.readLine()));
	
	System.out.println("-----------------------");
	
	if (totalOddNumbers != 0) {
	    System.out.println("We have " + totalOddNumbers + " odd number(s).");}
	else {
		System.out.println("You have no odd number(s)");
	}
	}

}
