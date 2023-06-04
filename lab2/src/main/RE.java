package main;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.*;

public class RE {
	public static boolean checkPhoneNumber(String s) {
		
		return s.matches("^\\(?\\d{3}\\)?[- ]?\\d{3}[- ]?\\d{4}$");
		
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a phone number: ");
		String input = sc.nextLine();
		boolean wasPhoneNum = checkPhoneNumber(input);
		System.out.println("\nThat was"+(wasPhoneNum? "" : "n't")+" a phone number."); 
	}
}

/*The \d means to java that it is escaping a special character signified by the "\" and 
 * then it wants digits signified by the "d"*/
