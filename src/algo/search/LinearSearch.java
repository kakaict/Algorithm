package algo.search;

import algo.sort.ArrayUtils;

/**
*
* @author khaitq on 18 août 2018
* 
* Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].
*/

public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170} ;
		int v = 110;
		
		ArrayUtils.printArray(arr);
		
		System.out.print(search(v, arr));
		
	}
	
	public static int search(int v, int [] arr) {
		int result = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == v) {
				result = i;
			}
		}
		return result;
	}

}


