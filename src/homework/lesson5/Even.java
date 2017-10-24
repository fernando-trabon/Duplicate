package homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Even {

	private static boolean EvenN(int number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input integer number: ");
		int dob = 1;
		int tmp;
		do {
			tmp = Integer.parseInt(reader.readLine());
			if (tmp > 0) {
				if (EvenN(tmp) == true) {
					dob = dob * tmp;
				}
			}
		} while (tmp > 0);
		System.out.println("Product all even numders: " + dob);

	}
}
