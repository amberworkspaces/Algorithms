package cn.edu.chapter2.exercises;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import edu.princeton.cs.introcs.StdOut;
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
		cbs.show();
		cbs.sort();
		StdOut.println("-----------------sorted---------------------");
		cbs.show();
		Assert.assertTrue(true);
	}

	@Test
	@Ignore
	public void testExchIntInt() {
		boolean r = cbs.less(0, 1);
		cbs.exch(0, 1);
		boolean er = cbs.less(0, 1);
		Assert.assertNotEquals(r, er);;
	}

	@Test
	@Ignore
	public void testShow() {
		cbs.show();
		Assert.assertTrue(true);
	}

	@Test
	@Ignore
	public void testLess() {
		Card x = new Card(CardColor.spade,CardNum.$2);
		Card y = new Card(CardColor.spade,CardNum.$A);
		Assert.assertTrue(cbs.less(x, y));
	}

}
