package rercusive;


/**
*
* @author khaitq on 7 sept. 2018
*/

public class ReverseDigit {

	public static void main(String[] args) {

		System.out.println(reversDigits(231));
	}
	
	
	public static int reversDigits(int num) {
        int result = 0;
        
        while(num > 0) {
        
        		result = result * 10 + num % 10;
            num = num / 10;
        }
        
        return result;
    }

	

}


