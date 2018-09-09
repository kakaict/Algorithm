package recusive.string;


/**
 * Created by khaitq
 * Date: 09/09/2018
 * Github:  https://github.com/quangkhai88
 */


/*
    Print all possible strings of length k that can be formed from a set of n characters

    set[] = {'a', 'b'}, k = 2
    Output: aa bb ab ba
 */

public class BuildStringFromCharacters {

    public static  void  main(String args[] ) {

        char [] set = { 'a', 'b' , 'c' };
        int n = 3;

        print("", set, n);

    }

    public static void print(String prefix, char [] set, int n) {

        if (prefix.length() == n) {

            System.out.println(prefix);

        } else {

            for (int i = 0; i < set.length; i ++) {

                print(prefix + set[i], set, n);

            }

        }

    }


}







