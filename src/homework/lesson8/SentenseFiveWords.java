package homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SentenseFiveWords {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a sentence with five words: ");
		String str = reader.readLine();
		String[] array = str.split(" ");
		String maxWord = array[0];
		for (String s : array) {
			if (s.length() > maxWord.length()) {
				maxWord = s;
			}
		}
		System.out.println("The longest word in the sentence - '" + maxWord + "' and its length equals "
				+ maxWord.length() + " symbol(s).");
		System.out.println("The second word in reverse order: " + new StringBuilder(array[1]).reverse().toString() + " ("
				+ array[1] + ")");
	}

}
