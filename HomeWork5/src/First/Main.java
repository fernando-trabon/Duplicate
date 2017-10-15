package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import First.second.Methods;

public class Main {

	public static void main(String[] args) throws IOException {
		Methods m = new Methods();
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("2)");
		System.out.println("The amounts of days: "+m.daymonths(sc));
		
		System.out.println();
		System.out.println("2)");
		System.out.println("Result: " + m.sumpos(sc));

		System.out.println();
		System.out.println("3)");
		m.finder(sc);
		
		System.out.println();
		System.out.println("4)");
		System.out.println("Product of entered integers: " + m.enteringint(sc));
	
		System.out.println();
		System.out.println("5)");
		m.cars(sc);
	}

}
