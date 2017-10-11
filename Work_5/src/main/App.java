package main;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.met.Methods;

public class App {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		int[] numbers = {1, 2, 9, 123, 23, -12, 214, 33, 90, -32};
		Methods m = new Methods();
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("MAX: " + m.biggest(numbers));
//		System.out.println("Sum of positive: " + m.sumpos(numbers));
//		System.out.println("Amount of negative numbers: " + m.amountneg(numbers));
//		System.out.println("More values: " + m.whatvalmore(numbers));
		
		m.empofdep(sc);
	}

}
