package test;
import myset.*;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetTest {
	
	private Set testset;
	private final String KEY = "key";
	
	@Before
	public void setUp() {
		testset = new Set();
	}
	
	@Test
	public void testEmpty() {
		Assert.assertEquals(0, testset.size());
	}
	
	@Test
	public void testPut() {
		testset.put(KEY, "val");
		Assert.assertEquals(1, testset.size());
	}
	
	@Test
	public void testGet() {
		testset.put(KEY, "value");
		Assert.assertEquals("value", testset.get(KEY));
	}
	
	@Test
	public void testOverwrite() {
		testset.put(KEY, "value");
		testset.put(KEY, "VALUE");
		Assert.assertEquals(1, testset.size());
		Assert.assertEquals("VALUE", testset.get(KEY));
	}

	@Test
	public void testGrows() {
		for (int i = 0; i < 20; i++) {
			testset.put(KEY + i, "value");
		}
		Assert.assertEquals(20, testset.size());
	}
}

