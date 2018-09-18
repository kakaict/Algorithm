package dailycoding;

/**
 * Created by khaitq
 * Date: 17/09/2018
 * Github:  https://github.com/quangkhai88
 */

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
You may assume nums1 and nums2 cannot be both empty.
Median : middle point of 2 arrays

Example 1:
nums1 = [1, 3]
nums2 = [2]
The median is 2.0   (from (1,2,3) => 2)

Example 2:
nums1 = [1, 2]
nums2 = [3, 4]
The median is (2 + 3)/2 = 2.5  ( from 1,2,3,4 => (2+3)/2 = 2.5 )


        int ar1[] = {1, 12, 15, 26, 38};
        int ar2[] = {2, 13, 17, 30, 45};
        => 16
 */

public class Median2SortedArray {


        public static void main(String args[]) {


            int ar1[] = {1, 2};
            int ar2[] = {3 , 4};


       //     1  , 2, 12, 13, 15, 17, 26, 30, 38, 45

            System.out.println(findMedianOf2SortedArray(ar1, ar2));

        }

        public static double findMedianOf2SortedArray(int arr1[], int arr2[]) {
            double result = 0;

            int [] merge = new int[arr1.length + arr2.length];

            int i = 0, j = 0, k = 0;

            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    merge[k++] = arr1[i];
                    i++;
                } else {
                    merge[k++] = arr2[j];
                    j++;
                }
            }

            while (i < arr1.length) {
                merge[k++] = arr1[i];
                i++;
            }

            while (j < arr2.length) {
                merge[k++] = arr2[j];
                j++;
            }

            int medium = merge.length/2;

            result =  merge.length%2 != 0 ? merge[medium] : (float)(merge[medium-1] + merge[medium])/2;

            return  result ;

        }
}
