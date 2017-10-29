package homework.lesson1;

// Inputting and outputting data 
// Skrypets O

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = "default name", address = "default address";
		System.out.println("What is your name?");
		try {
			name = br.readLine();
			System.out.println("Where are you live, " + name + "?");
			address = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.err.println(e);
			}
			System.out.println("----------------\nName: " + name + "\nAddress: " + address);

		}

	}

}
