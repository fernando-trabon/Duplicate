package homework.lesson9.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double result;
		System.out.println("Input two double numbers: ");
		
		try {
			result = div(Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine()));
			System.out.println("The result of divide -  " + result);
			}
		
		catch (ArithmeticException e) {
			System.out.println("You can't devide by 0");
		}catch (NumberFormatException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.out.println("Invalid I/O");
		}
		
	}
	

	public static double div(double a, double b)  {
		return a / b;
	}
}
