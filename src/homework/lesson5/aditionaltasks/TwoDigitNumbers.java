package homework.lesson5.aditionaltasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDigitNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[90];
		int j = 10;
		for (int i = 0; i < array.length; i++) {
			array[i] = j;
			j++;
		}

		System.out.println("Input k: (from 1 to 180)");
		int tmp = Integer.parseInt(reader.readLine()) + 1;
		int k = tmp / 2;
		double g = tmp % 2;
		System.out.println(g);
		int n = array[k];
		if (g == 1) {
			System.out.println(n % 10);
		} else {
			System.out.println(n / 10);
		}
		 for (int element : array) {
			System.out.print(element + ",");
		 }
	}

}
