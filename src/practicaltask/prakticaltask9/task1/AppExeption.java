package practicaltask.prakticaltask9.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppExeption {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		int a = 0;
		int b = 0;
		
		try {
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			result = squareRectangle(a, b);
		} catch (NumberFormatException e) {
			result = -1;
			e.printStackTrace();
		} catch (NegativeNumberException e) {
			result = -2;
			e.printStackTrace();
		} catch (IOException e) {
			result = -3;
			e.printStackTrace();
		}
		System.out.println("Result = " + result);
		
	}

	public static int squareRectangle(int a, int b) throws NegativeNumberException, IOException {
		if (a < 0 | b < 0) {
			throw new NegativeNumberException("You inputed negative number");
		} else {
			return a * b;
		}
	}
}
