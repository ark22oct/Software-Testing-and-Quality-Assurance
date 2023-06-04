package test;
import main.PrimeNumberChecker;
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
public class PrimeNumberCheckerTheoriesTest {

	@DataPoints
	public static int[] numbers() {
		return new int[] {2,6,19,22,23};
	}
	
	@Theory
	public void testPrimeCheck(int n) throws Exception{
	System.out.println (String.format("Testing input: %d", n));
		
		assumeNotNull(n);
		
		boolean actual = PrimeNumberChecker.primeCheck(n);
		
		System.out.println (String.format("Is it a prime number? %b \n",actual));
		
		//assertThat (actual, is(allOf(containsInteger(n))));
	}
}
