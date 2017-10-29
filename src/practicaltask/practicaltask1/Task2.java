package practicaltask.practicaltask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Work with variable class String
// Skrypets O

public class Task2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "default";
		System.out.println("How are you?");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("You are " + answer.toLowerCase() + ".");
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
