package test;
import main.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class mathTest {

	
	
	@Test
	// b > a
	public void testMath() {
		int a1 = 2;
		int b1 = 3;
		int actual = math.func(a1,b1);
		assertEquals (1, actual);
	}
	

	@Test
	// a > b
	public void testMath2() {
		int a2 = 3;
		int b2 = 2; 
		int actual = math.func(a2, b2);
		assertEquals (1, actual);
	}
	
	@Test
	// Other case 
	public void testMath3() {
		int a3 = 1;
		int b3 = 1;
		int actual = math.func(a3, b3);
		assertEquals (0, actual);
		
	}
}

