package homework.lesson9.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumberInRange {

	public static void main(String[] args) {
		int start = 20;
		int end = 80;
		for (int i = 0; i < 10; i++) {
			try {
				readNumber(start, end);
			} catch (NumberFormatException e) {
				System.err.println(e);
			} catch (InvalidNumberException e) {
				System.err.println(e);
			} catch (IOException e) {
				System.err.println(e);
			}

		}
		System.out.println("The end!");
	}

	public static void readNumber(int start, int end)
			throws NumberFormatException, IOException, InvalidNumberException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number ");
		int number = Integer.parseInt(br.readLine());
		if ((number <= start) || (number >= end)) {
			throw new InvalidNumberException("Your inputted number is not in the range!");
		} else {
			System.out.println("You inputted number - " + number);
			System.out.println("----------------------");
		}
	}

}
