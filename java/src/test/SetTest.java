package test;
import myset.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetTest {
  public Set emptySet;

  @Before
  public void setUp(){
    emptySet = new Set();
  }

  @Test
  public void testEmptyWithInitalized (){
    Assert.assertEquals(0, emptySet.getSize());
  }

  @Test
  public void testCanPutItemIntoSet () {
    emptySet.put("someKey", new Integer(42));

    Integer i = (Integer)emptySet.get("someKey");

    Assert.assertEquals(i.intValue(), 42);

    Assert.assertEquals(emptySet.getSize(), 1);
  }

  @Test
  public void testCanGetItemFromSet () {
    emptySet.put("getKey", new Integer(50));

    Integer i = (Integer)emptySet.get("getKey");

    Assert.assertEquals(50, i.intValue());
  }

  @Test
  public void testKeysAreUnique () {
    emptySet.put("someKey", new Integer(42));
    emptySet.put("someKey", new Integer(50));

    Assert.assertEquals(1, emptySet.getSize());

    Integer i = (Integer) emptySet.get("someKey");

    Assert.assertEquals(50, i.intValue());
  }
}
