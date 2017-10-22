package homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumFive {
	
	// Count first five elements true or false
	
	public static boolean firstFivePositive(int[] array) {
		int j = 0;
		for (int i = 0; i < 5; i++) {
			if (array[i] > 0) {
				j++;
			}
		}
		if (j == 5) {
			return true;
		} else {
			return false;
		}
	}
	
	// Input array elements
	
	public static void inputElements (BufferedReader reader, int[] array) throws NumberFormatException, IOException {
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(reader.readLine());
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[10];
		int sum = 0;
		
		System.out.println("Input 10 (int) numbers: ");
		
		inputElements(reader, array);

		if (firstFivePositive(array) == true) {
			for (int i = 0; i < 5; i++) {
				sum += array[i];
			}
			System.out.println("Sum = " + sum);
		} else {
			int dob = 1;
			for (int i = 5; i < 10; i++ ) {
				dob = dob * array[i];
			}
			System.out.println("Dob = " + dob);
		
		}

	}

}
