package me.prg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
   public static void main(String[] args)  {
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("1)");
	System.out.println("Enter radius value:");
	double r=0;
	try {
		r = Double.parseDouble(sc.readLine());
	} catch (NumberFormatException | IOException e) {
		System.err.println(e);		
	} 
	double p = 2*3.14*r;
	double s = 3.14*r*r;
    System.out.println("Perimeter: "+p);
    System.out.println("Area: "+s);
    System.out.println();
    System.out.println("2)");
    System.out.println("What is your name?");
    String name ="";
    String adress ="";
	try {
		name = sc.readLine();
		System.out.println("Where are you live,"+name+"?");
		adress = sc.readLine();
	} catch (IOException e) {
		System.err.println(e);
	}
   
    System.out.println();
    System.out.println("Whole information");
    System.out.println("Name: "+name);
    System.out.println("Adress: "+adress);
    System.out.println();
    System.out.println("3)");
    System.out.println("Enter prises for different countries");
    System.out.println("Enter c1:");
    double c1=0;
    double c2=0;
    double c3=0;
	try {
		c1 = Double.parseDouble(sc.readLine());
		 System.out.println("Enter c2:");
		 c2 = Double.parseDouble(sc.readLine());
		 System.out.println("Enter c3");
		 c3 = Double.parseDouble(sc.readLine());
	} catch (NumberFormatException | IOException e) {
		System.err.println(e);
	}
   
    System.out.println("Enter the durations of the conversations");
    System.out.println("Enter t1:");
    double t1=0;
    double t2=0;
    double t3=0;
	try {
		t1 = Double.parseDouble(sc.readLine());
		System.out.println("Enter t2:");
		t2 = Double.parseDouble(sc.readLine());
		System.out.println("Enter t3");
		t3 = Double.parseDouble(sc.readLine());
	} catch (NumberFormatException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
    System.out.println("First country will pay:"+c1*t1);
    System.out.println("Second country will pay:"+c2*t2);
    System.out.println("Third country will pay:"+c3*t3);
    System.out.println("All calls will cost:"+(c1*t1+c2*t2+c3*t3));
    
   }
}

