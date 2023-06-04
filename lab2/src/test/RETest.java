package test;
import main.RE;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;

public class RETest {
	
	@Test
	public void validTest() {
		
		String number = "123-456-7890";
		boolean check = true;
		assertEquals (check, RE.checkPhoneNumber(number));
	}
	
	@Test
	public void invalidTest() {
		
		String number = "123-.456.-789";
		boolean check = false;
		assertEquals (check, RE.checkPhoneNumber(number));
		
	}
	
	@Test
	public void areaCodeTest() {
		
		String number = "+1 123-456-7890";
		boolean check = false;
		assertEquals (check, RE.checkPhoneNumber(number));
		
	}
	
	@Test
	public void test1() {
		String number = "(123)123-1234";
		boolean check = true;
		assertEquals (check, RE.checkPhoneNumber(number));
		
	}
	
	@Test
	public void test2() {
		String number = "(123) 456-7890";
		boolean check = true;
		assertEquals (check, RE.checkPhoneNumber(number));
		
	}
	
	@Test
	public void test3() {
		String number = "123 123-1234";
		boolean check = true;
		assertEquals (check, RE.checkPhoneNumber(number));
		
	}

}
