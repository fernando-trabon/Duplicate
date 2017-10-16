package c_abs.first;

import c_abs.Person;

public class Student extends Person{
	
	private String type_person = "Student";
		
	public Student(String name){
		this.setName(name);
	}
	
	@Override
	public void print() {
		System.out.println("I am a " + type_person);	
		System.out.println("My name is: " + this.getName());
	}
	
}

