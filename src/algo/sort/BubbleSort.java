package algo.sort;

import utils.ArrayUtils;

/**
*
* @author khaitq on 16 août 2018
* 
* swap elements if they are in wrong order
* Repeate these step util they are sorted
*/

public class BubbleSort {
	
	public static void main(String[] args) {

		int[] arr  =  { 12, 11, 13, 5, 6 };

		sort(arr);
	}
	
	
	public static int [] sort(int [] arr) {

		boolean sorted = false;
		
		while (!sorted) {

			sorted = true;
			
			for (int i = 0; i < arr.length-1; i ++) {
				if (arr[i] > arr[i+1]) {
					swap(arr, i, i+1);
					sorted = false;
				}
			}
			
			ArrayUtils.printArray(arr);
		}

		
		return arr;
	}
	
	private static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}


