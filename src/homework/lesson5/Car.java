package homework.lesson5;

public class Car {
	private Type type;
	private int yearOfProduction;
	private double engineCapasity;

	// Constructor
	
	public Car() {
	}
	

	public Car(Type type) {
		this.type = type;
	}

	public Car(Type type, int yearOfProduction) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
	}

	public Car(Type type, int i, double engineCapasity) {
		this.type = type;
		this.yearOfProduction = i;
		this.engineCapasity = engineCapasity;
	}
	
	// Getters and setters

	public Type getType() {
		return type;
	}


	public int getYearOfProduction() {
		return yearOfProduction;
	}


	public double getEngineCapasity() {
		return engineCapasity;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}


	public void setEngineCapasity(double engineCapasity) {
		this.engineCapasity = engineCapasity;
	}


	@Override
	public String toString() {
		return "Car [type = " + type + ", engine Capasity = " + engineCapasity + "]";
	}


	public String printElement() {
		return "[Type] = " + type + ", [Year of production] = " + yearOfProduction + ", [engine capasity] = " + engineCapasity + ".";
	}
	
	
	
	
}
enum Type {SEDAN,HACHBACK, UNIVERSAL,COUPE, LEAFTBACK};