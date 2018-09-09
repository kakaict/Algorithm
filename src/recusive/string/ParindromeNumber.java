package recusive.string;


/**
*
* @author khaitq on 7 sept. 2018
*/

public class ParindromeNumber {

	public static void main(String[] args) {

		System.out.println(isParindromeNumber(12321));

        System.out.println(isParindromeNumber(20502));
		
	}
	
	
	/*
	 * 24542 is a parindrome number : x = reverse(x)
	 */

	public static boolean isParindromeNumber(int x) {

		if (x < 10)
			return true;

		if (x < 100)
			return x/10 == x %10;

		int a = x % 10;
		int b = x /10;
		int i = 10;
		while (b > 10) {
		    b = b /10;
            i = i * 10;
		}

        if (b != a)
            return false;

		x = (x - a) - b * i;
		x = x /10;
		while (x % 10 == 0)
            x /= 10;

        return isParindromeNumber(x);
	}

}


