package main;

public class PrimeNumberChecker {
	
	public static boolean primeCheck(int n) {
		
		//Prime number cannot be less than 1
		if (n <= 1) {
			return false;
		}
		
		//checking if the number provided has divisors other than 1 or itself 
		for (int i = 2; i<n; i++) {
			
			if (n % i == 0)
				return false;
		}
		
		return true;
	}

}
