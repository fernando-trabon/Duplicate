package homework.lesson7.task3;

import java.util.ArrayList;

public class AppStudent {

	public static void main(String[] args) {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student("Alizar", 3));
		arraylist.add(new Student("Antonio", 2));
		arraylist.add(new Student("Sandra", 4));
		arraylist.add(new Student("Bartolomeo", 3));
		arraylist.add(new Student("Hulio", 5));
		arraylist.sort(new NameComparator());
		System.out.println(arraylist.toString());
		arraylist.sort(new CourseComparator());
		System.out.println(arraylist.toString());
		System.out.println("__________________");
		Student.printStudents(arraylist, 3);
	}

}
