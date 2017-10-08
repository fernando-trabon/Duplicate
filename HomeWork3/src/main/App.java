package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.logic.Person;

public class App {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Person	p1 = new Person("Vasya", 1990);
		
		Person p2 = new Person();
		p2.input();
		
		Person p3 = new Person("Petya", 1990);
		p3.changeName();
		
		Person p4 = new Person("Sofiya", 10);
		
		Person p5 = new Person();
		p5.input();
		
		System.out.println("Enter current year");
		
		Person.setThisYear(Integer.parseInt(br.readLine()));
		
		System.out.println("----------------------------------------");
		
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();
		
		System.out.println("----------------------------------------");
	}

}
