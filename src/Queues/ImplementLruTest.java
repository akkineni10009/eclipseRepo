package Queues;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImplementLruTest {
  private ImplementLruCache test;

  public ImplementLruTest() {
    this.test = new ImplementLruCache(2);
  }

  @Test
  public void testCacheEmpty() {
    assertEquals(test.get(1), "-1");
  }

  @Test
  public void testQueueFull() {
    test.set(1, "A");
    test.set(2, "B");
    test.set(3, "C");
    assertEquals(test.get(1), "-1");
    assertEquals(test.get(1), "-1");
  }

  @Test
  public void testGetRenewsEntry() {
    test.set(1, "A");
    test.set(2, "B");
    assertEquals(test.get(1), "A");
    test.set(3, "C");
    assertEquals(test.get(1), "A");
    assertEquals(test.get(2), "-1");
    assertEquals(test.get(3), "C");
  }
}
