package dailycoding;

import utils.ArrayUtils;

/**
 * Created by khaitq
 * Date: 18/09/2018
 * Github:  https://github.com/quangkhai88
 */

/*
Asked by UBER
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
For example,
if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
 */

public class ProductArray {

    public static void main(String args []) {

        int[] arr =  {1, 2, 3, 4, 5};

        ArrayUtils.printArray(productArray(arr));
    }

    public static int[] productArray(int[] arr) {

        int[] result = new int[arr.length];

        int product = 1;
        for (int i : arr) {
            product *= i;
        }

        for (int i = 0; i < arr.length; i++) {

//          result[i] = product / arr[i];
            //if you can't use division:
            result[i] = divide(product,arr[i]);
        }

        return result;
    }


    private static int divide(int product, int i) {
        int result = 1;

        while (product > 0) {
            product = product - i;
            result ++;
        }
        return result;
    }

    private static int divideByBinary(int product, int i) {

        int result = 1;

        //TODO: divide 2 integers by using binary




        return result;

    }


}

