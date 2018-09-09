package recusive.string;

/**
 * Created by khaitq
 * Date: 09/09/2018
 * Github:  https://github.com/quangkhai88
 */

public class FirstUpperCaseLetter {


    public static void main(String args[]) {

        System.out.println(firstUpperCaseLetter("javaThebEst".toCharArray() , 0));

        System.out.println(firstUpperCaseLetter("javathebEst".toCharArray()));


    }

    public static char firstUpperCaseLetter(char [] s, int i) {

        if (Character.isUpperCase(s[i])) {
            return s[i];
        }
        return firstUpperCaseLetter(s, ++i);

    }

    public static char firstUpperCaseLetter(char [] c) {

        for (int i = 0; i < c.length; i++) {
            if (Character.isUpperCase(c[i])) {
                return c[i];
            }
        }
        return ' ';
    }
}
