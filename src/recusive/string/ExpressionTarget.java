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

        int v = Character.getNumericValue(s.toCharArray()[0]);

        printExpression(s.toCharArray(),1, v, 1, target, v + "");
        printExpression(s.toCharArray(),1, v, 2, target, v + "");
        printExpression(s.toCharArray(),1, v, 3, target, v + "");
    }


    //wrong solution
    public static void printExpression(char [] chars, int i, int v, int oper, int target, String s) {

        if (i < chars.length) {

            int c = Character.getNumericValue(chars[i]);

            if (i == chars.length - 1) {
                if (oper == 1 && c + v == target) {
                    System.out.println(s + "+" + c);
                }
                if (oper == 2 && v - c == target) {
                    System.out.println(s + "-" + c);
                }
                if (oper == 3 && c * v == target) {
                    System.out.println(s + "*" + c);
                }

            } else {

                int  j = i + 1;

                printExpression(chars, j, v + c, 1, target, i == 0 ?  s + "" + c  : s + "+" + c);
                printExpression(chars, j, v + c, 2, target, i == 0 ?  s + "" + c  : s + "+" + c);
                printExpression(chars, j, v + c, 3, target, i == 0 ?  s + "" + c  : s + "+" + c);

                printExpression(chars, j, v - c, 1, target, i == 0 ?  s + "" + c  : s + "-" + c);
                printExpression(chars, j, v - c, 2, target, i == 0 ?  s + "" + c  : s + "-" + c);
                printExpression(chars, j, v - c, 3, target, i == 0 ?  s + "" + c  : s + "-" + c);

                printExpression(chars, j, i== 0? c : v * c, 1, target, i == 0 ?  s + "" + c  : s + "*" + c);
                printExpression(chars, j, i== 0? c : v * c, 2, target, i == 0 ?  s + "" + c  : s + "*" + c);
                printExpression(chars, j, i== 0? c : v * c, 3, target, i == 0 ?  s + "" + c  : s + "*" + c);


            }

        }

    }













}
