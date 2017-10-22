package main.met;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import main.met.Methods;


class Test {

	@org.junit.jupiter.api.Test
	void testUnion() {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>(); 
		Set<Integer> set3 = new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		
		Set<String> set4 = new HashSet<String>();
		Set<String> set5 = new HashSet<String>(); 
		Set<String> set6 = new HashSet<String>();
		
		set4.add("1");
		set4.add("2");
		set4.add("3");
		
		set5.add("3");
		set5.add("4");
		set5.add("5");
		
		set6.add("1");
		set6.add("2");
		set6.add("3");
		set6.add("4");
		set6.add("5");
		
		Methods m = new Methods();
						
		assertTrue(m.union(set1, set2).equals(set3)&&m.union(set4, set5).equals(set6));
		
		

	}

	@org.junit.jupiter.api.Test
	void testIntersect() {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>(); 
		Set<Integer> set3 = new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		
		set3.add(3);
		
		
		Set<String> set4 = new HashSet<String>();
		Set<String> set5 = new HashSet<String>(); 
		Set<String> set6 = new HashSet<String>();
		
		set4.add("1");
		set4.add("2");
		set4.add("3");
		
		set5.add("3");
		set5.add("4");
		set5.add("5");
		
		
		set6.add("3");
		
		
		Methods m = new Methods();
						
		assertTrue(m.intersect(set1, set2).equals(set3)&&m.intersect(set4, set5).equals(set6));
		
		

	}
}
