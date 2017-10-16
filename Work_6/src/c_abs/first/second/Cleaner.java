package c_abs.first.second;

import c_abs.first.Staff;

public class Cleaner extends Staff{
	
	private String type_person = "Cleaner";
	
	public Cleaner(String name){
		this.setName(name);
	}
		
	@Override
	public double salary() {
		return 100;
	}

	@Override
	public void print() {
		System.out.println("I am a " + type_person);	
		System.out.println("My name is: " + this.getName());
		
	}

}
