package test;
import myset.*;

import org.junit.Assert;
import org.junit.Test;

public class SetTest {
	@Test
	public void testAssertTrue() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void testEmptyWithInitalized (){
		Set emptySet = new Set<String, V> ();
		Assert.assertEquals(0, emptySet.size);
	}
}
