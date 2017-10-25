package main;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

import main.exeption.ColorException;
//import main.exeption.Negativelength;
import main.exeption.TypeException;
//import main.met.Mtds;
import main.met.Plants;

public class App {

	public static void main(String[] args) {
//		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("Rectangle area");
//		int a1=0;
//		int b1=0;
		
//		try {
//			System.out.println("Enter a:");
//			 a1 =Integer.parseInt(sc.readLine());
//			System.out.println("Enter b:");
//			 b1 = Integer.parseInt(sc.readLine());
//		} catch (NumberFormatException|IOException e) {
//			System.err.println(e);
//		} 
//
//
//		
//			Mtds m = new Mtds();
//			try{
//				System.out.println("Area: " + m.squareRectangle(a1, b1));
//			}catch(Negativelength e1){
//				System.err.println(e1);
//			}
		
		Plants[] vase= new Plants[2];
			
		try {
			vase[0] = new Plants(1, "Red", "Rose");
			System.out.println(vase[0].toString());
			vase[1] = new Plants(1, "Blue", "Blue");
		} catch (ColorException | TypeException e) {
			System.err.println(e);
		}
		
		
	}
	
	
}
