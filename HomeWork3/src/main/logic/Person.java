package main.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	
	private String name;
	private int birthYear;
	private static int thisYear;
	
	
	public String read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void setThisYear(int ty) {
		Person.thisYear = ty;
	}

	public static int getThisYear() {
		return thisYear;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public Person() {}
	
	public int age() {
		return getThisYear()-this.getBirthYear();
	}
	
	public void input() throws NumberFormatException, IOException {
		System.out.println("Input Name:");
		this.setName(this.read());
		System.out.println("Input birthday year:");
		int NbirthYear = Integer.parseInt(this.read());
		this.setBirthYear(NbirthYear);
	}
	
	public void output() {
		System.out.println("Name:"+this.getName());
		System.out.println("Age:"+this.age());
		System.out.println("The birthday year:"+this.getBirthYear());
		System.out.println();
	}
	
	public void changeName() throws IOException {
		System.out.println("Current name:"+this.getName());
		System.out.println("Input new name:");
		this.setName(this.read());
		System.out.println("Name changed to:"+this.getName());
		
	}
}
