package dailycoding;

import algo.sort.QuickSort;
import utils.ArrayUtils;

/**
 * Created by khaitq
 * Date: 17/09/2018
 * Github:  https://github.com/quangkhai88
 */

/*
    From dailycodingproblem.com

    Return a new sorted merged list from K sorted lists, each with size N.
    For example, if we had [[10, 15, 30], [12, 15, 20], [17, 20, 32]],
    The result should be [10, 12, 15, 15, 17, 20, 20, 30, 32].
 */

public class MergeSortedLists {

    public static void main(String args[]) {

        int [] t1 =  {10, 15, 30};
        int [] t2 =  {12, 15, 20};
        int [] t3 =  {17, 20, 32};

        ArrayUtils.printArray(mergeSortedListsV2( t1, t2, t3));

    }

    public static int[] mergeSortedListsV2(int [] ... lists) {

        int [] result = lists[0];

        for (int i = 1; i < lists.length; i++) {
            result = merge2array(result, lists[i]);
        }

        return result;
    }

    /*
     *  merge 2 sorted arrays
     */
    public static int[] merge2array(int [] arr1, int[] arr2) {

        int size = arr1.length +  arr2.length;
        int [] result = new int[size];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i];
                i++;
            } else {
                result[k++] = arr2[j];
                j++;
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i];
            i++;
        }

        while (j < arr2.length) {
            result[k++] = arr2[j];
            j++;
        }


        return result;
    }


    //naive solution
    public static int[] mergeSortedLists(int n, int k, int [] ... lists) {

        int size = n * k;
        int [] result = new int[size];

        int i = 0;
        for (int [] arr : lists) {
            for (int j : arr) {
                result[i++] = j;
            }
        }

        QuickSort.quickSort(result, 0, size - 1);

        return result;

    }


}
