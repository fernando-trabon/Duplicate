package javaCore.homework.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Person person1 = new Person();
		Person person2 = new Person("Oleg", 1975);
		Person person3 = new Person();
		Person person4 = new Person("Ira", 1983);
		Person person5 = new Person();

		person1.input(reader);
		person2.changeName(reader);
		person3.input(reader);
		person5.input(reader);

		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();

	}

}
