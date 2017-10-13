package homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumFive {
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

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Input 10 (int) numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(reader.readLine());
		}
		if (firstFivePositive(array) == true) {
			for (int i = 0; i < 5; i++) {
				sum += array[i];
			}
			System.out.println("Sum " + sum);
		} else {
			int dob = 1;
			for (int i = 5; i < 10; i++ ) {
				dob = dob * array[i];
			}
			System.out.println("Dob " + dob);
		
		}

	}

}
