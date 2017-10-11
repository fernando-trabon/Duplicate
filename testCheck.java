package javaCore.homework.lesson4.task1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCheck {

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
	public void testCheckRange() {
		Object actual = (Object) "True";
		Object expected = (Object) (Check.checkRange(-4.9900055f, 4.3851815f, -0.1215115f));
		assertEquals(expected, actual);
	}

	@Test
	public void testMinMaxNumbers() {
		int expecteds[] = Check.minMaxNumbers(-128, 118, 56);
		int actuals[] = { -128, 118 };
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testNameOfHttpError() {
		Object actual = (Object) (Check.nameOfHttpError("402").toString());
		Object expected = "PAYMENT_REQUIRED";
		assertEquals(expected, actual);
		actual = (Object) (Check.nameOfHttpError("403").toString());
		expected = "FORBIDDEN";
		assertEquals(expected, actual);
	}

}
