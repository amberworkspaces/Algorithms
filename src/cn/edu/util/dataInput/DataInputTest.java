package cn.edu.util.dataInput;


import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.princeton.cs.introcs.In;

public class DataInputTest {
	DataInput di = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		di = new DataInput("D:\\desktop\\workdoc\\algs4-data.zip");
		System.out.println("init DataInput");
	}

	@After
	public void tearDown() throws Exception {
		di.close();
		System.out.println("destroy DataInput");
	}

	@Test
	public void testGetContentStream() {
		In in = null;
		in = di.getContentStream("1Kints.txt");
		assertNotNull(in);
	}

}
