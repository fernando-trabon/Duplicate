package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.methods.Mtd;

public class App {

	public static void main(String[] args) throws IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		Mtd m = new Mtd();
		
		System.out.println("Enter sentence of five words");
		String sentence = sc.readLine();
		String maxw = m.longestWord(sentence);
		System.out.println("Longest word in the sentence: "+ maxw);
		
		System.out.println("Number of its letters: "+ m.numbersOfletters(maxw));
		
		System.out.println(m.secondreversed(sentence));
		System.out.println("------------------------------");

		System.out.println("Enter sentence to be corrected");
		System.out.println(m.spacesconverter(sc.readLine()));
		System.out.println("------------------------------");
		
		System.out.println("Enter sentence with $$");
		m.moneyMade(sc.readLine());
		
	}

}
