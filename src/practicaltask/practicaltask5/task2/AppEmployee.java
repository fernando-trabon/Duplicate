package practicaltask.practicaltask5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppEmployee {

	// Sort array by salary

	public static void descArrayBySalary(Employee[] arrEmp) {
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

	// Display all employees

	public static void displayArr(Employee[] arrEmp) {
		for (Employee element : arrEmp) {
			System.out.println(element.printElement());
		}
	}
	// Display employees with same department number

	public static void sameDepNumber(BufferedReader reader, Employee[] array)
			throws NumberFormatException, IOException {
		System.out.println("Input department number: ");
		int num = Integer.parseInt(reader.readLine());
		int fg = 0;
		for (Employee element : array) {
			if (element.getDepartmentNumber() == num) {
				System.out.println(element.toString());
			} else {
				fg += 1;
			}
		}
		System.out.println(
				(fg == array.length) ? "We don't have the employees work in the department number " + num : "End list");
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Employee[] arrEmp = { new Employee("Lyubomur", 401, 5750.25), new Employee("Anton", 406, 7500.89),
				new Employee("Katya", 401, 5370.89), new Employee("Brovaxa", 150, 4680.80),
				new Employee("Iryna", 257, 8520.75) };

		sameDepNumber(reader, arrEmp);

		System.out.println("Display all employees");
		displayArr(arrEmp);
		System.out.println();
		System.out.println("Display all employees sort by salary");
		descArrayBySalary(arrEmp);
		displayArr(arrEmp);

	}
}
