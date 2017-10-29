package practicaltask.practicaltask3;

// Working with class Employee etc
// Skrypets O

public class AppEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Anton", 7.25);
		employee1.setHours(24);
		Employee employee2 = new Employee("Jhon", 12.5, 17);
		Employee employee3 = new Employee("Roman", 18.35, 40);
		employee2.changeRate(13.5);
		System.out.println(employee3.bonuses());
		System.out.println(employee1 + "\n" + employee2 + "\n" + employee3);
		System.out.println(Employee.totalSum);
		employee3.changeRate(20);
		System.out.println(Employee.totalSum);
	}

}
