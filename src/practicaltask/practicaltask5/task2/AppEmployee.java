package practicaltask.practicaltask5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AppEmployee {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		
		Employee[] arrEmp = { 
				new Employee("Lyubomur", 401, 5750.25),
				new Employee("Anton", 406, 7500.89),
				new Employee("Katya", 401, 5370.89), 
				new Employee("Brovaxa", 150, 4680.80),
				new Employee("Iryna", 257, 8520.75) };
		
		
		
		Employee.sameDepNumber(reader, arrEmp);
		
		
	
	
	}
}
