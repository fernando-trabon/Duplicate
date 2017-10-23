package main.met;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.add.Student;

public class Methods {
	
	public <E> Set<E> union(Set<E> set1, Set<E> set2) { 
		
		if (!set2.isEmpty()){
			for (E e: set2) {
				if (!set1.contains(e)) {
					set1.add(e);
				}
			}
		}
		
		return set1;
	}

	public <E> Set<E> intersect(Set<E> set1, Set<E> set2){
		set1.retainAll(set2);
		return set1;
	}
	
	public void samefirstname(Map<String, String> map) {
		Set<String> c = new HashSet<String>( );
		c.addAll(map.values());
		
		if (map.size() != c.size()) {
			System.out.println("There are at less two persons with the same firstName among these people");
		}else {
			System.out.println("There aren`t two persons with the same firstName among these people");
		}
	}
	
	public  void printStudents(List<Student> students, Integer course) {
		Iterator<Student> iterator = students.iterator();
		Student tmp = new Student();
		System.out.println("Students of selected course");
		while (iterator.hasNext()) {
			tmp = iterator.next();
			if(tmp.getCourse() == course) {
				System.out.println("Name: " + tmp.getName());
			}
		}
	}

}
