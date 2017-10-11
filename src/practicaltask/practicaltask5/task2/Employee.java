package practicaltask.practicaltask5.task2;

import java.io.BufferedReader;
import java.io.IOException;

public class Employee {
	private String name;
	private int departmentNumber;
	private double salary;

	// Constructor
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

	public static void descSalary(Employee[] arrEmp) {
		Employee tmp;
		for (int i = 0; i < arrEmp.length - 1; i++) {
			for (int j = i + 1; j < arrEmp.length; j++) {
				if (arrEmp[i].getSalary() < arrEmp[j].getSalary()) {
					tmp = arrEmp[i];
					arrEmp[i] = arrEmp[j];
					arrEmp[j] = tmp;
				}
			}
		}

	}

	public static void sameDepNumber(BufferedReader reader, Employee[] array)
			throws NumberFormatException, IOException {
		System.out.println("Input department number: ");
		int numDep = Integer.parseInt(reader.readLine());
		Employee.descSalary(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i].getDepartmentNumber() == numDep) {
				System.out.println(array[i].getName() + "  " + array[i].getSalary());
			}
		}
	}

}
