package Program.mtd;

import java.io.BufferedReader;
import java.io.IOException;

public class MTD {

	public double div(double a, double b) throws ArithmeticException{
		if (b == 0) {
			throw new ArithmeticException("Division by zero");
		}
		
		return a/b;	
	}
	
	public int readNumber(BufferedReader sc, int start, int end) throws NumberFormatException, IOException, ArithmeticException {
		
		System.out.println("Enter integer number");
		
		int res = Integer.parseInt(sc.readLine());
		
		if ((res>=start)&&(res<=end)) {
			return res;
		}else {
			throw new ArithmeticException("out of range ["+start+","+end+"]");
		}
		
		
	}
}
