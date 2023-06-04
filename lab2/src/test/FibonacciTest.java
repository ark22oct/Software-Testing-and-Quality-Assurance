package test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import main.Fibonacci;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

@RunWith(Parameterized.class)
public class FibonacciTest {
	   
		private int number;
	    private int expected;
	    
	    public FibonacciTest(int number, int expected) {
	        this.number = number;
	        this.expected = expected; }
	    
	    @Parameterized.Parameters
	    public static Collection<Object[]> data(){
	        return Arrays.asList(new Object[][] {     
	           { 0, 0 },
	           { 1, 1 }, 
	           { 2, 1 }, 
	           { 3, 2 }, 
	           { 4, 3 }, 
	           { 5, 5 }, 
	           { 6, 8 }, 
	           { 7, 13},
	           { 8, 21},
	           { 9, 34}
	       });    
	    }  

	    @Test
	    public void testIsValidInput() throws Exception {
	        int actual = Fibonacci.compute(number);
	        assertEquals(expected, actual);
	        
	    }
}
