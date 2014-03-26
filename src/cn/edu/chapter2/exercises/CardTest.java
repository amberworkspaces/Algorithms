package cn.edu.chapter2.exercises;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CardTest {
	Card x;
	Card y;
	@Before
	public void setUp() throws Exception {
		x = new Card(CardColor.heart,CardNum.$7);
		y = new Card(CardColor.diamond,CardNum.$A);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCompareTo() {
		int result = x.compareTo(y);
		Assert.assertTrue(result>0);
	}

}
