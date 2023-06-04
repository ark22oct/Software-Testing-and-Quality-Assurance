package test;
import main.MathematicalTheory;

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
import static org.junit.Assume.assumeTrue;

@RunWith(Theories.class)
public class MathematicalTheoryTest {
	
	/*
	@DataPoints
	public static int[] newval() {
		return new int[] {1, 2, 307, 400567};
	}
	*/
	
	/*
	 @DataPoints
	 public static int[] newval() {
		return new int[] {0, -1, -10, -1234, 1, 10, 6789};
		}
	 */
	

	@DataPoints
	public static int[] newval() {
		return new int[] {0, -1, -10, 1, 10, 6789, Integer.MAX_VALUE, Integer.MIN_VALUE};
	}

	@Theory
	public void testTheory(int a, int b) throws Exception {
		System.out.println (String.format("Testing first theory with %d and %d", a, b));
		
		assumeNotNull(a,b);
		
		boolean actual = MathematicalTheory.theory(a,b);

		System.out.println (String.format("Actual: " + actual + "\n"));
		assumeTrue(actual);
		assertTrue(actual);
	}
	
	@Theory
	public void testCommutative(int a, int b) throws Exception {
		System.out.println (String.format("Testing commutative property with %d and %d", a, b));
		
		assumeNotNull(a,b);
		
		boolean actual = MathematicalTheory.commutative(a,b);
		assumeTrue(actual);
		System.out.println (String.format("Actual: " + actual + "\n"));
		
	}
	
}
