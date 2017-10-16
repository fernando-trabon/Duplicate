package Interface.animals;

import Interface.Animal;

public class Dog implements Animal{
	
	public String voice(){
		return "Woof";
	}
	
	public String feed(){
		return "Meat";
	}
}
