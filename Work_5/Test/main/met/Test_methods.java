package main.met;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_methods {

	@Test
	public void testBiggest() {
		Methods m = new Methods();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		assertTrue(m.biggest(numbers) == 10);		
	}

	@Test
	public void testSumpos() {
		Methods m = new Methods();
		int[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
		assertTrue(m.sumpos(numbers) == 25);
	}

	@Test
	public void testAmountneg() {
		Methods m = new Methods();
		int[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
		assertTrue(m.amountneg(numbers) == 5);
	}

	@Test
	public void testWhatvalmore() {
		Methods m = new Methods();
		int[] numbers = {1, -2, -3, -4, 5, -6, 7, -8, 9, -10};
		assertTrue(m.whatvalmore(numbers).equals("Negative"));
	}

}
