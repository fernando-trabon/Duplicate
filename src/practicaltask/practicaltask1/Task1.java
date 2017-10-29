package practicaltask.practicaltask1;

// Mathematical operators
// Skrypets O

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		System.out.println("Input numbers a and b:");
		try {
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			System.out.println(
					"a + b = " + (a + b) + "\na - b = " + (a - b) + "\na * b = " + (a * b) + "\na / b = " + (a / b));
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
