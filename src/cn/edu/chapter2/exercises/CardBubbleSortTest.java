package cn.edu.chapter2.exercises;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CardBubbleSortTest {

	private static CardBubbleSort cbs = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cbs = new CardBubbleSort();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		cbs = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCardBubbleSort() {
		assertNotNull(cbs);
	}

	@Test
	public void testSort() {
		fail("Not yet implemented");
	}

	@Test
	public void testExchIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testShow() {
		cbs.show();
	}

	@Test
	public void testLess() {
		fail("Not yet implemented");
	}

}
