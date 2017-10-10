package main.met;

import static org.junit.Assert.*;

import org.junit.Test;
import main.met.Methods;
import main.add.Dog;
import main.add.Dog.Breed;

public class met_calc_test {

	@Test
	public void testBelong() {
		Methods m = new Methods();
		assertTrue(m.belong(1).equals("Yes"));
		assertTrue(m.belong(6).equals("No"));
	}

	@Test
	public void testMax() {
		Methods m = new Methods();
		assertTrue(m.max(1, 2, 3)==3);
		assertTrue(m.max(1, 3, 2)==3);
		assertTrue(m.max(3, 1, 2)==3);
		assertTrue(m.max(3, 2, 1)==3);
		assertTrue(m.max(2, 3, 1)==3);
		assertTrue(m.max(2, 1, 3)==3);
	}

	@Test
	public void testMin() {
		Methods m = new Methods();
		assertTrue(m.min(1, 2, 3)==1);
		assertTrue(m.min(1, 3, 2)==1);
		assertTrue(m.min(3, 1, 2)==1);
		assertTrue(m.min(3, 2, 1)==1);
		assertTrue(m.min(2, 3, 1)==1);
		assertTrue(m.min(2, 1, 3)==1);
	}

	@Test
	public void testSamebreed() {
		Methods m = new Methods();
		
		Dog d1 = new Dog("Riley", Breed.Hound, 1);
		Dog d2 = new Dog("Rex", Breed.Spaniel, 2);
		Dog d3 = new Dog("Max", Breed.Hound, 3);
		
		assertTrue(m.samebreed(d1, d2, d3).equals("Yes"));
	}

}
