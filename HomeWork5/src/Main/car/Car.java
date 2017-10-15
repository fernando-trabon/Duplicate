package Main.car;

public class Car {
	public String type;
	public int yearofproduction;
	public float engcapacity;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYearofproduction() {
		return yearofproduction;
	}
	public void setYearofproduction(int yearofproduction) {
		this.yearofproduction = yearofproduction;
	}
	public float getEngcap() {
		return engcapacity;
	}
	public void setEngcap(float engcapacity) {
		this.engcapacity = engcapacity;
	}
	
	public Car() {}
	
	public Car(String type, int yearofproduction, float engcapacity) {
		this.type = type;
		this.yearofproduction = yearofproduction;
		this.engcapacity = engcapacity;
	}
	
}
