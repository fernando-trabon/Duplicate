package Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Program.mtd.MTD;

public class Main {

	public static void main(String[] args){
		MTD m = new MTD();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		double a=0;
		double b=0;
		
		try{
			System.out.println("Enter a");
			a = Double.parseDouble(sc.readLine());
			System.out.println("Enter b");
			b = Double.parseDouble(sc.readLine());
		}catch (IOException | NumberFormatException e) {
			System.err.println(e);
		}
		
		try{
			System.out.println(m.div(a, b));
		}catch (ArithmeticException e) {
			System.err.println(e);
		}
		
		int start =2;
		int num;
		int i=0;
		
		while (i<10) {
			try{
				 num = m.readNumber(sc, start, 99);
				 System.out.println(num);
				 start = ++num;
				 i++;
			}catch(ArithmeticException|IOException|NumberFormatException e) {
				System.err.println(e);
			}
			continue;
		}

	}

}
