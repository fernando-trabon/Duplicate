package Interface.animals;

import Interface.Animal;

public class Cat implements Animal{
	
	public String voice(){
		return "Meow";
	}
	
	public String feed(){
		return "Fish";
	}
}
