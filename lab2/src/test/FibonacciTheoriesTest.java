package test;
import main.Fibonacci;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeThat;

@RunWith(Theories.class)
public class FibonacciTheoriesTest {

	@DataPoints
	public static int[] numbers() {
		return new int[] {0,1,2,3,4,5,6,7,8,9,10};
	}
	
	@Theory
	public void testCompute(int n) throws Exception{
		System.out.println (String.format("Index: %d", n));
		
		assumeNotNull(n);
		
		int actual = Fibonacci.compute(n);
		
		System.out.println (String.format("Corresponding fibonacci: %d \n",actual));
		
		//assertEquals (actual, is(allOf(containsString(n))));
	}
}
