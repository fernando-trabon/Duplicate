package javaCore.homework.lesson4.task1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javaCore.homework.lesson4.task1.Dog.Breed;

public class testDog {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testClassDog() {
		Dog dog1 = new Dog("Boba", Breed.DOBERMAN, 2);
		Dog dog2 = new Dog("Unga", Breed.ROTTWEILER, 7);
		Dog dog3 = new Dog("Boba", Breed.LABRADOR, 14);
		assertTrue(Dog.compareThreeDogs(dog1, dog2, dog3));
		
	}

}
