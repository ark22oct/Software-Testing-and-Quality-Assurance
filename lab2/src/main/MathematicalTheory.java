package main;

public class MathematicalTheory {
	
	public static boolean theory (int a, int b) {
		
		boolean checker = false;
		
		if (a>0 && b>0 && a+b > a && a+b > b) {
			
			checker = true;
			
		}
		return checker;
		
	}
	
	public static boolean commutative (int a, int b) {
		
		boolean checker = false;
		
		if (a+b == b+a) {
			checker = true;
		}
		return checker;
	}

}
