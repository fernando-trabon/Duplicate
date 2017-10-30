package homework.lesson7.task3;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	private String name;
	private int course;

	public Student() {
		super();
	}

	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public int getCourse() {
		return course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public static void printStudents(ArrayList<Student> arrayList, int course) {
		Iterator<Student> it = arrayList.iterator();
		while (it.hasNext()) {
			Student tmp = it.next();
			if (tmp.getCourse() == course) {
				System.out.println(tmp.getName());
			}
		}
	}
}
