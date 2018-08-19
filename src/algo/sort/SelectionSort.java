package algo.sort;

import utils.ArrayUtils;

/**
*
* @author khaitq on 16 août 2018
* 
*  Maitain 2 subarrays: sorted + unsorted 
* 
*  Search the minimum e in unsorted subarray and move it to the tail of sorted subarray
*/

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr  =  { 12, 11, 13, 5, 6 };

		sort(arr);
	}
	
	
	public static int [] sort(int [] arr) {
		
		for (int i = 0; i < arr.length; i ++) {
			
			int minIndex = getMinNumberIndex(arr, i);
			
			int min = arr[minIndex];
			
			arr[minIndex] = arr[i];
			
			arr[i] = min;
			
			ArrayUtils.printArray(arr);
			
		}
		
		return arr;
	}
	
	private static int getMinNumberIndex(int arr[],int begin) {
		int r = begin;
		for (int i = begin; i < arr.length; i++) {
			if (arr[i] < arr[r]) {
				r = i;
			}
		}
		return r;
	}

}


