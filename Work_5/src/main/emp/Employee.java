package main.emp;

public class Employee {
	private String name;
	private int depnum;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepnum() {
		return depnum;
	}
	public void setDepnum(int depnum) {
		this.depnum = depnum;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(String name, int depnum, int salary) {
		super();
		this.name = name;
		this.depnum = depnum;
		this.salary = salary;
	}
	
	public Employee(){};
}
