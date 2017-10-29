package practicaltask.practicaltask3;

// Working with class Employee
// Skrypets O

public class Employee {
	private String name;
	private double rate;
	private int hours;
	public static double totalSum = 0;

	public Employee() {
		super();
	}

	public Employee(String name, double rate) {
		super();
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, double rate, int hours) {
		super();
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + this.salary(rate, hours);
	}
	
	public double getTotalSum() {
		return totalSum;
	}
	
	public String getName() {
		return name;
	}

	public double getRate() {
		return rate;
	}

	public int getHours() {
		return hours;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRate(double rate) {
		totalSum = totalSum - this.salary(rate, hours);
		this.rate = rate;
		totalSum = totalSum +  this.salary(rate, hours);
		
	}

	public void setHours(int hours) {
		totalSum = totalSum - this.salary(rate, hours);
		this.hours = hours;
		totalSum = totalSum +  this.salary(rate, hours);
	}

	public double salary(double rate, int hours) {
		return rate * hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	public void changeRate(double rate) {
		totalSum = totalSum - this.salary(rate, hours);
		this.rate = rate;
		totalSum = totalSum +  this.salary(rate, hours);
	}
	
	public double bonuses(){
		return (this.hours * this.rate)/10;
	}
}
