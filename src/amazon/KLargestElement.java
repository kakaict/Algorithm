package amazon;

import java.util.Arrays;

import algo.sort.MergeSort;
import utils.ArrayUtils;

/**
*
* @author khaitq on 19 août 2018
* 
* Find K largest (smallest) element in an array
* 
* => sort (by using quick or merge sort) => print k elements
*/

public class KLargestElement {

	public static void main(String[] args) {

		int[] arr  =  { 130, 11, 13, 5, 6, 20, 9, 100 };
		int  k = 3;
		
		//=> 100,20,13
		
		ArrayUtils.printArray(findLargestElementV2(k, arr));
		
	}
	
	public static int[] findLargestElement( int k , int [] arr) {
		
		int [] result = new int [k];
		
		MergeSort.sort(arr, 0, arr.length - 1);

		for (int i = 0 ; i < k; i++) {
			result[i] = arr[arr.length - 1 - i];
		}
		
		return result;
	}
	
	//Use API 
	public static int[] findLargestElementV2( int k , int [] arr) {
		
		int [] result = new int [k];
		
		Arrays.sort(arr);;

		for (int i = 0 ; i < k; i++) {
			result[i] = arr[arr.length - 1 - i];
		}
		
		return result;
	}

}


