package algo.array;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * Created by khaitq
 * Date: 19/06/2019
 * Github:  https://github.com/quangkhai88
 */

/*
    From a String  "Strings" =>  find char whose occuring is max (min) => s
 */
public class FindOccuringCharInString {


    public static  void main(String ...arts) {

        String input = "GHSLOOOVVVVV";

        System.out.println(getCharMaxOccurring(input));

    }

    private static char getCharMaxOccurring(String input) {

        int[] temp = new int[256];

        for (char s : input.toCharArray()) {
            temp[s] ++;
        }

        int v = -1;
        char p = ' ';

        for (int i = 0; i < input.length(); i++) {
            if (temp[input.charAt(i)] > v) {
                v = temp[input.charAt(i)];
                p = input.charAt(i);
            }
        }

        return p;

    }


}
