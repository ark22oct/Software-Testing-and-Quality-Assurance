package test;
import main.PrimeNumberChecker;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.hamcrest.CoreMatchers.*;
import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class PrimeNumberCheckerTest {
	
	private int number;
	private boolean expected;
	
	public PrimeNumberCheckerTest(int number, boolean expected) {
		this.number = number;
		this.expected = expected;
	}
	
	
	@Parameterized.Parameters
	public static Iterable<Object[]> data() {
		
		return Arrays.asList(new Object[][]{
			
			{2, true},
			{6, false},
			{19, true},
			{22, false},
			{23, true}
			
			} ); }


	
	@Test
	public void testPrimeNumber() throws Exception {
		
		boolean actual = PrimeNumberChecker.primeCheck(number);
				
				assertEquals(expected, actual);
	
	}

}