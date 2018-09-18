package dailycoding;

/**
 * Created by khaitq
 * Date: 17/09/2018
 * Github:  https://github.com/quangkhai88
 */

/*
    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
    For example, given [10, 15, 3, 7] and k of 17,
    return true since 10 + 7 is 17.
 */

public class SumPairFromArray {

    public static void main(String [] args) {

        int[] arr =  {10, 15, 3, 7};

        int sum = 17;

        findPairsFromArray(arr, sum);

    }

    public static void findPairsFromArray(int [] arr, int sum) {

        for (int i = 0; i < arr.length-1; i ++) {

            for (int j = i; j < arr.length; j++) {

                if (arr[i] + arr[j] == sum) {

                    System.out.println(arr[i] + " & " + arr[j]);
                }
            }
        }
    }

}
