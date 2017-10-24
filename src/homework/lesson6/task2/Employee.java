package homework.lesson6.task2;

public abstract class Employee {
	String employeeID;
	String name;

	public abstract double calculatePay(); 

	public Employee(String employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}

}
