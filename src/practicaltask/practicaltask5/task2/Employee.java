package practicaltask.practicaltask5.task2;

public class Employee {
	private String name;
	private int departmentNumber;
	private double salary;

	// Constructor
	public Employee() {
	}
	
	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, int departmentNumber) {
		this.name = name;
		this.departmentNumber = departmentNumber;
	}

	public Employee(String name, int departmentNumber, double salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[name] = " + name +  ", [salary] = " + salary + "$";
	}
	
	public String printElement() {
		return "[Name] = " + name + ", [Department number]" + departmentNumber + ", [salary] = " + salary + "$";
	}
	
	
}
