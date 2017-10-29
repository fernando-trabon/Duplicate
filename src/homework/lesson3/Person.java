package homework.lesson3;

// Skrypets O

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;

public class Person {
	private String name;
	private int birthYear;

	// Create constructors

	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	// Create getters and setters

	public String getName() {
		return name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	// Method for calculating age of person

	public int calculateAge() {
		Calendar calendar = Calendar.getInstance();
		int nowYear = calendar.get(Calendar.YEAR);
		return nowYear - this.birthYear;
	}

	// Method enter all data of person

	public void input(BufferedReader reader) throws IOException {
		System.out.println("Input name of person: ");
		this.setName(reader.readLine());
		System.out.println("Input birthYear of person: ");
		this.setBirthYear(Integer.parseInt(reader.readLine()));

	}

	// Method give all information about person

	public void output() {
		System.out.println("Person's name:      [" + this.name + "]" + '\n' + "Person's birthYear: [" + this.birthYear
				+ "]" + '\n' + "Person's age:       [" + this.calculateAge() + "]");
		System.out.println("");

	}

	// Method change person's name

	public void changeName(BufferedReader reader) throws IOException {
		System.out.println("Input person's name(rename): ");
		this.name = reader.readLine();
	}

}
