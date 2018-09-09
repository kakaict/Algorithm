package recusive;


/**
*
* @author khaitq on 7 sept. 2018
*/

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(isPrimeNumber(73, 2));
		
	}
	
	public static boolean isPrimeNumber(int a, int i) {
		
		if (i > Math.sqrt(a))
			return true;
		
		if (a %i == 0) 
			return false;
		
		return isPrimeNumber(a, ++i);
	}
	
}


