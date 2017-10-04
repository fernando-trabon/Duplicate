package main;

import main.work.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee w1 = new Employee("Vova",1,6);
		
		Employee w2 = new Employee("Pasha", 1);
		w2.setHours(15);
		Employee w3 = new Employee("Sveta", 2, 12);
		
		w1.salary();
		w2.salary();
		w3.salary();
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println("Total salary:"+ Employee.gettotalSum());;

	}

}
