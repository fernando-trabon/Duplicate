package c_abs.first.second;

import c_abs.first.Staff;

public class Teacher extends Staff {
	
	private String type_person = "Teacher";
	
	public Teacher(String name){
		this.setName(name);
	}
	
	@Override
	public double salary() {
		return 200;
	}

	@Override
	public void print() {
		System.out.println("I am a " + type_person);	
		System.out.println("My name is: " + this.getName());		
	}

}
