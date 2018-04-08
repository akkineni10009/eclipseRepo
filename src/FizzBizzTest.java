import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBizzTest {

  FizzBizz fb;

  public FizzBizzTest() {
    fb = new FizzBizz();
  }

  @Test
  public void testFizzBizz() {
    assertEquals(fb.fizzBizz(3), "Fizz");
    assertEquals(fb.fizzBizz(5), "Buzz");
    assertEquals(fb.fizzBizz(15), "Fizz Buzz");
    assertEquals(fb.fizzBizz(12), "Fizz");
    assertEquals(fb.fizzBizz(8), "8");
  }

}
