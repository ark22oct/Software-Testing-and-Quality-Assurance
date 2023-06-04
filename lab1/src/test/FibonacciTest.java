package test;

//import static org.junit.Assert.*;
import junit.framework.TestCase;
import main.Fibonacci;
import org.junit.Test;

public class FibonacciTest extends TestCase {

	@Test
	public void test() {
		int actualValue = Fibonacci.fibonacci_iterative(3);
		int expectedValue = 3;
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void test2() {
		int actualValue = Fibonacci.fibonacci_iterative(-17);
		int expectedValue = 1;
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void test3() {
		int actualValue = Fibonacci.fibonacci_iterative(10);
		//System.out.println(Fibonacci.fibonacci_iterative(10));
		int expectedValue = 89;
		
		assertEquals(expectedValue, actualValue);
		
	}

	@Test
	public void testAdditional() {
		int firstValue = Fibonacci.fibonacci_iterative((0));
		int secondValue = Fibonacci.fibonacci_iterative((1));
		
		if (firstValue != secondValue) {
			fail("The first two values of the fibonacci sequence should match and be 1");
		}
	}
}
