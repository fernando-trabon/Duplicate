package javaCore.homework.lesson3;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Person person1 = new Person();
		Person person2 = new Person("Oleg", 1975);
		Person person3 = new Person();
		Person person4 = new Person("Ira", 1983);
		Person person5 = new Person();
		
		person1.input();
		person2.changeName();
		person3.input();
		person5.input();
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();

	}

}
