package recusive.string;

/**
 * Created by khaitq
 * Date: 09/09/2018
 * Github:  https://github.com/quangkhai88
 */

/*
 * Given a string that contains only digits from 0 to 9, and an integer value, target.
 * Find out how many expressions are possible which evaluate to target using binary operator +, – and * in given string of digits.
 *
 *  (+ - *)
 * Example:
 *
 *  Input : "123",  Target : 6
    Output : {“1+2+3”, “1*2*3”}

    Input : “125”, Target : 7
    Output : {“1*2+5”, “12-5”}
 */

public class ExpressionTarget {

    public static  void main(String args[]) {


        String s = "262";
        int target = 10;

        printExpression(s.toCharArray(), 1, 10, Character.getNumericValue(s.charAt(0)) + "");
    }


    //bad solution
    public static void printExpression(char [] chars, int i,  int target, String s) {

        char [] expr = s.toCharArray();

        if (i == chars.length  && calculateFromEx(s) == target ) {
            System.out.println(s);

        } else if (i < chars.length ) {

                int j = i+1;

                int c = Character.getNumericValue(chars[i]);

                printExpression(chars, j, target,  i == 0 ?  s + "" + c  : s + "+" + c);
                printExpression(chars, j, target,  i == 0 ?  s + "" + c  : s + "-" + c);
                printExpression(chars, j, target,  i == 0 ?  s + "" + c  : s + "*" + c);

        }


    }



    /*

        calculate a Math formular from a String, without using Strings APIs (Char APIs are OK)
        ex : "2+3*5-1" = 16
     */

    private static  int calculateFromEx(String s) {

        int v = 0;

        int[] values = new int[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '*' ) {

                int temp =  (i-2 > 0 && s.charAt(i-2) == '-') ? -Character.getNumericValue(s.charAt(i - 1)): Character.getNumericValue(s.charAt(i - 1));

                int j  = i;
                while (j < s.length() && s.charAt(j) == '*') {
                    temp =   temp * Character.getNumericValue(s.charAt(j + 1));
                    j = j +2;
                }
                values[k++] = temp;
                i = j;

            } else if (Character.isDigit(s.charAt(i)) && (i + 1 == s.length() || s.charAt(i+1) == '-' ||s.charAt(i+1) == '+' )) {
                values[k++] = (i > 0 && s.charAt(i-1) == '-') ? - Character.getNumericValue(s.charAt(i)) : Character.getNumericValue(s.charAt(i));
            }

        }
        for (int i :    values) {
           v += i;
        }

        return v;
    }




}
