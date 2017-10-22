package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.add.CourseComparator;
import main.add.NameComparator;
import main.add.Student;
import main.met.Methods;

public class App {

	public static void main(String[] args) throws IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		Methods m = new Methods();
		
		Map<String, String> personMap = new HashMap<String, String>();
		
		for (int i=0; i<7; i++) {
			personMap.put(Integer.toString((i+1)), Integer.toString((i+1)));
		}
		personMap.put("8", "1");
		personMap.put("9", "Orest");
		personMap.put("10", "Orest");
		
		System.out.println(personMap);
		
		m.samefirstname(personMap);

		System.out.println("----------------------");
		System.out.println("Enter firstname to be deleted");
		String name = sc.readLine();
		
		Map<String, String> tmpMap = new HashMap<String, String>();
		
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (!entry.getValue().equals(name)) {
				tmpMap.put(entry.getKey(), entry.getValue());
			}
		}
		personMap.clear();
		personMap = tmpMap;
		
		System.out.println("----------------------");
		System.out.println(personMap);
		System.out.println("----------------------");
		
		List<Student> students = new ArrayList<Student>();
		
		for (int i=0; i<4; i++) {
			students.add(new Student(Integer.toString(i+1),i+1));
		}
		students.add(new Student("5",1));
		
		System.out.println("Enter course of interest");
		int course = Integer.parseInt(sc.readLine());
		m.printStudents(students, course);
		
		students.sort(new NameComparator());
		System.out.println(students);
		
		System.out.println("----------------------");
		students.sort(new CourseComparator());
		System.out.println(students);
	}

}
