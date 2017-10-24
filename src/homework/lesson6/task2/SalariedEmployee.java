 package homework.lesson6.task2;

public class SalariedEmployee extends Employee implements Payable {
	private String socialSecurityNumber;
	private double salary;
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SalariedEmployee(String employeeID, String name, String socialSecurityNumber, double salary) {
		super(employeeID, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.salary = salary;
	}
	
	@Override
	public double calculatePay() {
		return this.salary;
	}
	@Override
	public String toString() {
		return "EmployeeID = " + employeeID + ", name = " + name + ", The average monthly wage = "
				+ salary;
	}
	
	
	

	

}
