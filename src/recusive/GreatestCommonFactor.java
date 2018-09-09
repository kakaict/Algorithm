package recusive;


/**
*
* @author khaitq on 7 sept. 2018
*/

public class GreatestCommonFactor {

	public static void main(String[] args) {

		System.out.println(findGreatestCommonFactor(80, 120));

	}

	/*
	 * findGreatestCommonFactor : (45, 30)  => 6
	 */
	public static int findGreatestCommonFactor(int a, int b) {
		
		if (a > b && a % b == 0) {
			return b;
		}
		
		if (a < b && b % a == 0) {
			return a;
		}
		
		if (a  > b) 
			return findGreatestCommonFactor(a-b, b);
		
		if (a  < b) 
			return findGreatestCommonFactor(b - a, a);
		
		return 1;
	}
	
}


